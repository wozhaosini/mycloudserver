/*
 * Copyright 2014 etao.com All right reserved. This software is the
 * confidential and proprietary information of etao.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with etao.com .
 */
package org.dlut.mycloudserver.client.service.hostmanage;

import org.dlut.mycloudserver.client.common.MyCloudResult;
import org.dlut.mycloudserver.client.common.Pagination;
import org.dlut.mycloudserver.client.common.hostmanage.HostDTO;
import org.dlut.mycloudserver.client.common.hostmanage.QueryHostCondition;

/**
 * 类IHostManageService.java的实现描述：TODO 类实现描述
 * 
 * @author luojie 2014年10月27日 下午10:29:07
 */
public interface IHostManageService {

    /**
     * 根据id获取物理机
     * 
     * @param hostId
     * @return
     */
    MyCloudResult<HostDTO> getHostById(int hostId);

    /**
     * 创建物理机
     * 
     * @param hostDTO
     * @return 返回新创建的物理机的id
     */
    MyCloudResult<Integer> createHost(HostDTO hostDTO);

    /**
     * 更新物理机
     * 
     * @param hostDTO
     * @return
     */
    MyCloudResult<Boolean> updateHost(HostDTO hostDTO);

    /**
     * 根据id删除物理机
     * 
     * @param hostId
     * @return
     */
    MyCloudResult<Boolean> deleteHostById(int hostId);

    /**
     * 根据查询条件统计物理机的数量
     * 
     * @param queryHostCondition
     * @return
     */
    MyCloudResult<Integer> countQuery(QueryHostCondition queryHostCondition);

    /**
     * 分页查询物理机数量
     * 
     * @param queryHostCondition
     * @return
     */
    MyCloudResult<Pagination<HostDTO>> query(QueryHostCondition queryHostCondition);
}
