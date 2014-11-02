/*
 * Copyright 2014 etao.com All right reserved. This software is the
 * confidential and proprietary information of etao.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with etao.com .
 */
package org.dlut.mycloudserver.service.hostmanage.impl;

import static org.junit.Assert.fail;

import javax.annotation.Resource;

import org.dlut.mycloudserver.client.common.MyCloudResult;
import org.dlut.mycloudserver.client.common.hostmanage.HostDTO;
import org.dlut.mycloudserver.client.service.hostmanage.IHostManageService;
import org.dlut.mycloudserver.service.BaseTestCase;
import org.junit.Test;

/**
 * 类HostManageServiceImplTest.java的实现描述：TODO 类实现描述
 * 
 * @author luojie 2014年11月2日 下午8:28:57
 */
public class HostManageServiceImplTest extends BaseTestCase {

    @Resource
    private IHostManageService hostManageService;

    /**
     * Test method for
     * {@link org.dlut.mycloudserver.service.hostmanage.impl.HostManageServiceImpl#getHostById(int)}
     * .
     */
    @Test
    public void testGetHostById() {
        MyCloudResult<HostDTO> result = hostManageService.getHostById(1);
        printObject(result);
    }

    /**
     * Test method for
     * {@link org.dlut.mycloudserver.service.hostmanage.impl.HostManageServiceImpl#createHost(org.dlut.mycloudserver.client.common.hostmanage.HostDTO)}
     * .
     */
    @Test
    public void testCreateHost() {
        HostDTO hostDTO = new HostDTO();
        hostDTO.setHostName("test");
        hostDTO.setHostIp("127.0.0.1");
        MyCloudResult<Integer> result = hostManageService.createHost(hostDTO);
        printObject(result);
    }

    /**
     * Test method for
     * {@link org.dlut.mycloudserver.service.hostmanage.impl.HostManageServiceImpl#updateHost(org.dlut.mycloudserver.client.common.hostmanage.HostDTO)}
     * .
     */
    @Test
    public void testUpdateHost() {
        fail("Not yet implemented");
    }

    /**
     * Test method for
     * {@link org.dlut.mycloudserver.service.hostmanage.impl.HostManageServiceImpl#deleteHostById(int)}
     * .
     */
    @Test
    public void testDeleteHostById() {
        fail("Not yet implemented");
    }

    /**
     * Test method for
     * {@link org.dlut.mycloudserver.service.hostmanage.impl.HostManageServiceImpl#countQuery(org.dlut.mycloudserver.client.common.hostmanage.QueryHostCondition)}
     * .
     */
    @Test
    public void testCountQuery() {
        fail("Not yet implemented");
    }

    /**
     * Test method for
     * {@link org.dlut.mycloudserver.service.hostmanage.impl.HostManageServiceImpl#query(org.dlut.mycloudserver.client.common.hostmanage.QueryHostCondition)}
     * .
     */
    @Test
    public void testQuery() {
        fail("Not yet implemented");
    }

}
