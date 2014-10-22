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

    private String            userName;

    private RoleEnum          role;

    /**
     * 分页码
     */
    private int               pageNO;

    /**
     * 每页数量
     */
    private int               pageSize;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

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

    public int getPageNO() {
        return pageNO;
    }

    public void setPageNO(int pageNO) {
        this.pageNO = pageNO;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

}
