/*
 * Copyright 2014 etao.com All right reserved. This software is the
 * confidential and proprietary information of etao.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with etao.com .
 */
package org.dlut.mycloudserver.service.usermanage.impl;

import static org.junit.Assert.fail;

import javax.annotation.Resource;

import org.dlut.mycloudserver.client.common.MyCloudResult;
import org.dlut.mycloudserver.client.common.usermanage.QueryUserCondition;
import org.dlut.mycloudserver.client.common.usermanage.UserDTO;
import org.dlut.mycloudserver.client.service.usermanage.IUserManageService;
import org.dlut.mycloudserver.service.BaseTestCase;
import org.junit.Test;

/**
 * 类UserManageServiceTest.java的实现描述：TODO 类实现描述
 * 
 * @author luojie 2014年10月22日 下午11:41:10
 */
public class UserManageServiceTest extends BaseTestCase {

    @Resource
    private IUserManageService userManageService;

    /**
     * Test method for
     * {@link org.dlut.mycloudserver.service.usermanage.impl.UserManageService#getUserByAccount(java.lang.String)}
     * .
     */
    @Test
    public void testGetUserByAccount() {
        MyCloudResult<UserDTO> result = userManageService.getUserByAccount("31317030");
        printObject(result.getModel());
    }

    /**
     * Test method for
     * {@link org.dlut.mycloudserver.service.usermanage.impl.UserManageService#verifyAndGetUser(java.lang.String, java.lang.String, org.dlut.mycloudserver.client.common.usermanage.RoleEnum)}
     * .
     */
    @Test
    public void testVerifyAndGetUser() {
        fail("Not yet implemented");
    }

    /**
     * Test method for
     * {@link org.dlut.mycloudserver.service.usermanage.impl.UserManageService#createUser(java.lang.String, java.lang.String, org.dlut.mycloudserver.client.common.usermanage.RoleEnum)}
     * .
     */
    @Test
    public void testCreateUser() {
        fail("Not yet implemented");
    }

    /**
     * Test method for
     * {@link org.dlut.mycloudserver.service.usermanage.impl.UserManageService#query(org.dlut.mycloudserver.client.common.usermanage.QueryUserCondition)}
     * .
     */
    @Test
    public void testQuery() {
        fail("Not yet implemented");
    }

    /**
     * Test method for
     * {@link org.dlut.mycloudserver.service.usermanage.impl.UserManageService#countQuery(org.dlut.mycloudserver.client.common.usermanage.QueryUserCondition)}
     * .
     */
    @Test
    public void testCountQuery() {
        QueryUserCondition condition = new QueryUserCondition();
        //        condition.setRole(RoleEnum.STUDENT);
        MyCloudResult<Integer> result = userManageService.countQuery(condition);
        printObject(result.getModel());
    }

}
