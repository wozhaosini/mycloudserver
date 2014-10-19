/*
 * Copyright 2014 etao.com All right reserved. This software is the
 * confidential and proprietary information of etao.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with etao.com .
 */
package org.dlut.mycloudserver.service.usermanage.convent;

import org.dlut.mycloudserver.client.common.usermanage.RoleEnum;
import org.dlut.mycloudserver.client.common.usermanage.UserDTO;
import org.dlut.mycloudserver.dal.dataobject.UserDO;

/**
 * 类UserConvent.java的实现描述：TODO 类实现描述
 * 
 * @author luojie 2014年10月8日 下午11:11:29
 */
public class UserConvent {

    public static UserDTO conventToUserDTO(UserDO userDO) {
        if (userDO == null) {
            return null;
        }

        UserDTO userDTO = new UserDTO();
        userDTO.setAccount(userDO.getAccount());
        userDTO.setUserName(userDO.getUsername());
        userDTO.setRole(RoleEnum.getRoleByStatus(userDO.getRole()));

        return userDTO;
    }
}
