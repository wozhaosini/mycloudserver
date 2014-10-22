/*
 * Copyright 2014 etao.com All right reserved. This software is the
 * confidential and proprietary information of etao.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with etao.com .
 */
package org.dlut.mycloudserver.client.common.usermanage;

import java.io.Serializable;

/**
 * 类QueryUserCondition.java的实现描述：TODO 类实现描述
 * 
 * @author luojie 2014年10月22日 下午8:58:41
 */
public class QueryUserCondition implements Serializable {

    private static final long serialVersionUID = 1708961263436328093L;

    private String            account;

    private String            username;

    private RoleEnum          role;

    private int               offset           = 0;

    private int               limit            = 10;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getUserName() {
        return username;
    }

    public void setUserName(String userName) {
        this.username = userName;
    }

    public RoleEnum getRole() {
        return role;
    }

    public void setRole(RoleEnum role) {
        this.role = role;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

}
