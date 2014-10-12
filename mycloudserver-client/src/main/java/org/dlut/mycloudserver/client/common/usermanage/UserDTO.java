/*
 * Copyright 2014 etao.com All right reserved. This software is the
 * confidential and proprietary information of etao.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with etao.com .
 */
package org.dlut.mycloudserver.client.common.usermanage;

import org.dlut.mycloudserver.client.common.BaseDTO;

/**
 * 类UserDTO.java的实现描述：TODO 类实现描述
 * 
 * @author luojie 2014年9月22日 下午10:49:25
 */
public class UserDTO extends BaseDTO {

    private static final long serialVersionUID = -8136326022743105997L;

    /**
     * 用户名
     */
    private String            userName;

    /**
     * 账号
     */
    private String            account;

    /**
     * 角色
     */
    private RoleEnum          role;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public RoleEnum getRole() {
        return role;
    }

    public void setRole(RoleEnum role) {
        this.role = role;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

}
