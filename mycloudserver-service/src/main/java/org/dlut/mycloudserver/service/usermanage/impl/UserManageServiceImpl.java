/*
 * Copyright 2014 etao.com All right reserved. This software is the
 * confidential and proprietary information of etao.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with etao.com .
 */
package org.dlut.mycloudserver.service.usermanage.impl;

import java.util.List;

import javax.annotation.Resource;

import org.dlut.mycloudserver.client.common.ErrorEnum;
import org.dlut.mycloudserver.client.common.MyCloudResult;
import org.dlut.mycloudserver.client.common.Pagination;
import org.dlut.mycloudserver.client.common.usermanage.QueryUserCondition;
import org.dlut.mycloudserver.client.common.usermanage.RoleEnum;
import org.dlut.mycloudserver.client.common.usermanage.UserCreateReqDTO;
import org.dlut.mycloudserver.client.common.usermanage.UserDTO;
import org.dlut.mycloudserver.client.service.usermanage.IUserManageService;
import org.dlut.mycloudserver.dal.dataobject.UserDO;
import org.dlut.mycloudserver.service.usermanage.UserManage;
import org.dlut.mycloudserver.service.usermanage.convent.UserConvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 类UserManageService.java的实现描述：TODO 类实现描述
 * 
 * @author luojie 2014年10月12日 上午11:15:48
 */
@Service("userManageService")
public class UserManageServiceImpl implements IUserManageService {

    private static Logger log = LoggerFactory.getLogger(UserManageServiceImpl.class);

    @Resource(name = "userManage")
    private UserManage    userManage;

    @Override
    public MyCloudResult<UserDTO> getUserByAccount(String account) {
        UserDO userDO = userManage.getUserByAccount(account);
        UserDTO userDTO = UserConvent.conventToUserDTO(userDO);
        return MyCloudResult.successResult(userDTO);
    }

    @Override
    public MyCloudResult<UserDTO> verifyAndGetUser(String account, String password, RoleEnum roleEnum) {
        if (account == null || password == null || roleEnum == null) {
            return MyCloudResult.successResult(null);
        }

        UserDO userDO = userManage.getUserByAccount(account);
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
    public MyCloudResult<Pagination<UserDTO>> query(QueryUserCondition queryUserCondition) {
        if (queryUserCondition == null) {
            return MyCloudResult.failedResult(ErrorEnum.PARAM_NULL);
        }
        int totalCount = userManage.countQuery(queryUserCondition);
        List<UserDO> userDOList = userManage.query(queryUserCondition);
        //        int pageSize = queryUserCondition.getLimit();
        //        int pageNO = queryUserCondition.getOffset() / queryUserCondition.getLimit() + 1;
        //        Pagination<UserDTO> pagination = new Pagination<UserDTO>(pageNO, pageSize, totalCount,
        //                UserConvent.conventToUserDTOList(userDOList));
        //        return MyCloudResult.successResult(pagination);
        Pagination<UserDTO> pagination = new Pagination<UserDTO>(queryUserCondition.getOffset(),
                queryUserCondition.getLimit(), totalCount, UserConvent.conventToUserDTOList(userDOList));
        return MyCloudResult.successResult(pagination);
    }

    @Override
    public MyCloudResult<Integer> countQuery(QueryUserCondition queryUserCondition) {
        int totalCount = userManage.countQuery(queryUserCondition);
        return MyCloudResult.successResult(totalCount);
    }

    @Override
    public MyCloudResult<Boolean> createUser(UserCreateReqDTO userCreateReqDTO) {
        if (userCreateReqDTO == null) {
            return MyCloudResult.successResult(Boolean.FALSE);
        }
        UserDO userDO = UserConvent.conventToUserDO(userCreateReqDTO);
        if (userManage.createUser(userDO)) {
            return MyCloudResult.successResult(Boolean.TRUE);
        }
        return MyCloudResult.successResult(Boolean.FALSE);
    }
}
