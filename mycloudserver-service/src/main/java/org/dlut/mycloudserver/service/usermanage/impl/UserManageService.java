/*
 * Copyright 2014 etao.com All right reserved. This software is the
 * confidential and proprietary information of etao.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with etao.com .
 */
package org.dlut.mycloudserver.service.usermanage.impl;

import org.dlut.mycloudserver.client.common.MyCloudResult;
import org.dlut.mycloudserver.client.common.usermanage.RoleEnum;
import org.dlut.mycloudserver.client.common.usermanage.UserDTO;
import org.dlut.mycloudserver.client.service.usermanage.IUserManageService;
import org.springframework.stereotype.Service;

/**
 * 类UserManageService.java的实现描述：TODO 类实现描述
 * 
 * @author luojie 2014年10月12日 上午11:15:48
 */
@Service("userManageService")
public class UserManageService implements IUserManageService {

    @Override
    public MyCloudResult<UserDTO> getUserByAccount(String account) {
        UserDTO userDTO = new UserDTO();
        userDTO.setAccount("31317030");
        userDTO.setUserName("罗劼");
        userDTO.setRole(RoleEnum.STUDENT);
        return MyCloudResult.successResult(userDTO);
    }

    @Override
    public MyCloudResult<UserDTO> verifyAndGetUser(String account, String password, RoleEnum roleEnum) {
        UserDTO userDTO = new UserDTO();
        userDTO.setAccount("31317030");
        userDTO.setUserName("罗劼");
        userDTO.setRole(RoleEnum.STUDENT);
        return MyCloudResult.successResult(userDTO);
    }

}
