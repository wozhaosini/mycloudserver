/*
 * Copyright 2014 etao.com All right reserved. This software is the
 * confidential and proprietary information of etao.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with etao.com .
 */
package org.dlut.mycloudserver.service.usermanage.dao;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.dlut.mycloud.mycloudserver.dal.dataobject.UserDO;
import org.dlut.mycloud.mycloudserver.dal.mapper.UserManageMapper;
import org.springframework.stereotype.Service;

/**
 * 类UserManageDAO.java的实现描述：TODO 类实现描述
 * 
 * @author luojie 2014年10月7日 下午11:43:45
 */

@Service("userManageDAO")
public class UserManageDAO {

    @Resource
    private UserManageMapper userManageMapper;

    public UserDO getUserByAccount(String account) {
        if (StringUtils.isBlank(account)) {
            return null;
        }

        return userManageMapper.getUserByAccount(account);
    }
}
