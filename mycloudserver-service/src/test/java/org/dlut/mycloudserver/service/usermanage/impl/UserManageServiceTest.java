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
import org.dlut.mycloudserver.client.common.Pagination;
import org.dlut.mycloudserver.client.common.usermanage.QueryUserCondition;
import org.dlut.mycloudserver.client.common.usermanage.RoleEnum;
import org.dlut.mycloudserver.client.common.usermanage.UserCreateReqDTO;
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
        //        for (int i = 3; i < 30; i++) {
        //            UserCreateReqDTO userCreateReqDTO = new UserCreateReqDTO();
        //            userCreateReqDTO.setAccount(i + "");
        //            userCreateReqDTO.setPassword("110");
        //            userCreateReqDTO.setRole(RoleEnum.STUDENT);
        //            userCreateReqDTO.setUserName("罗劼");
        //            MyCloudResult<Boolean> result = userManageService.createUser(userCreateReqDTO);
        //            printObject(result.getModel());
        //        }

        UserCreateReqDTO userCreateReqDTO = new UserCreateReqDTO();
        userCreateReqDTO.setAccount("admin");
        userCreateReqDTO.setPassword("10041104");
        userCreateReqDTO.setRole(RoleEnum.ADMIN);
        userCreateReqDTO.setUserName("罗劼");
        MyCloudResult<Boolean> result = userManageService.createUser(userCreateReqDTO);
        printObject(result.getModel());
    }

    /**
     * Test method for
     * {@link org.dlut.mycloudserver.service.usermanage.impl.UserManageService#query(org.dlut.mycloudserver.client.common.usermanage.QueryUserCondition)}
     * .
     */
    @Test
    public void testQuery() {
        int page = 1;
        int pageSize = 10;
        QueryUserCondition condition = new QueryUserCondition();
        int offset = (page - 1) * pageSize;
        int limit = pageSize;
        condition.setOffset(offset);
        condition.setLimit(limit);
        condition.setRole(RoleEnum.ADMIN);
        MyCloudResult<Pagination<UserDTO>> result = userManageService.query(condition);
        printObject(result.getModel());
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
