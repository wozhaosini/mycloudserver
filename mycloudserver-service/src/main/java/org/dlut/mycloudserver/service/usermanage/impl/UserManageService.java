/*
 * Copyright 2014 etao.com All right reserved. This software is the
 * confidential and proprietary information of etao.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with etao.com .
 */
package org.dlut.mycloudserver.service.usermanage.impl;

import javax.annotation.Resource;

import org.dlut.mycloudserver.client.common.MyCloudResult;
import org.dlut.mycloudserver.client.common.Pagination;
import org.dlut.mycloudserver.client.common.usermanage.QueryUserCondition;
import org.dlut.mycloudserver.client.common.usermanage.RoleEnum;
import org.dlut.mycloudserver.client.common.usermanage.UserDTO;
import org.dlut.mycloudserver.client.service.usermanage.IUserManageService;
import org.dlut.mycloudserver.dal.dataobject.UserDO;
import org.dlut.mycloudserver.service.usermanage.convent.UserConvent;
import org.dlut.mycloudserver.service.usermanage.dao.UserManageDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 类UserManageService.java的实现描述：TODO 类实现描述
 * 
 * @author luojie 2014年10月12日 上午11:15:48
 */
@Service("userManageService")
public class UserManageService implements IUserManageService {

    private static Logger log = LoggerFactory.getLogger(UserManageService.class);

    @Resource(name = "userManageDAO")
    private UserManageDAO userManageDAO;

    @Override
    public MyCloudResult<UserDTO> getUserByAccount(String account) {
        UserDO userDO = userManageDAO.getUserByAccount(account);
        UserDTO userDTO = UserConvent.conventToUserDTO(userDO);
        return MyCloudResult.successResult(userDTO);
    }

    @Override
    public MyCloudResult<UserDTO> verifyAndGetUser(String account, String password, RoleEnum roleEnum) {
        if (account == null || password == null || roleEnum == null) {
            return MyCloudResult.successResult(null);
        }

        UserDO userDO = userManageDAO.getUserByAccount(account);
        if (userDO == null) {
            // 账号不存在
            log.info("用户账号" + account + " 不存在");
            return MyCloudResult.successResult(null);
        }
        if (!userDO.getPassword().equals(password)) {
            // 密码错误
            log.info("账号" + account + "的密码错误");
            return MyCloudResult.successResult(null);
        }
        if (userDO.getRole() != roleEnum.getStatus()) {
            // 用户不属于此角色
            log.info("账号" + account + "不属于角色" + roleEnum.getDesc());
            return MyCloudResult.successResult(null);
        }

        UserDTO userDTO = UserConvent.conventToUserDTO(userDO);
        return MyCloudResult.successResult(userDTO);
    }

    @Override
    public MyCloudResult<Boolean> createUser(String account, String password, RoleEnum roleEnum) {
        // TODO
        return null;
    }

    @Override
    public MyCloudResult<Pagination<UserDTO>> query(QueryUserCondition queryUserCondition) {
        // TODO
        return null;
    }

    @Override
    public MyCloudResult<Integer> countQuery(QueryUserCondition queryUserCondition) {
        int totalCount = userManageDAO.countQuery(queryUserCondition);
        return MyCloudResult.successResult(totalCount);
    }
}
