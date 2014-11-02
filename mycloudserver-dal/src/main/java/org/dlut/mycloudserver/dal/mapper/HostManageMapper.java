/*
 * Copyright 2014 etao.com All right reserved. This software is the
 * confidential and proprietary information of etao.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with etao.com .
 */
package org.dlut.mycloudserver.dal.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.dlut.mycloudserver.client.common.hostmanage.QueryHostCondition;
import org.dlut.mycloudserver.dal.dataobject.HostDO;

/**
 * 类HostManageMapper.java的实现描述：TODO 类实现描述
 * 
 * @author luojie 2014年10月28日 下午10:06:07
 */
public interface HostManageMapper {

    /**
     * 根据hostId获取主机
     * 
     * @param hostId
     * @return
     */
    HostDO getHostById(@Param("hostId") int hostId);

    /**
     * 创建主机
     * 
     * @param hostDO
     * @return 返回创建的物理机的id
     */
    int createHost(HostDO hostDO);

    /**
     * 删除主机
     * 
     * @param hostId
     * @return
     */
    int deleteHostById(@Param("hostId") int hostId);

    /**
     * 更新主机
     * 
     * @param hostDO
     * @return
     */
    int updateHost(HostDO hostDO);

    /**
     * 统一物理机数量
     * 
     * @param queryHostCondition
     * @return
     */
    int countQuery(QueryHostCondition queryHostCondition);

    /**
     * 分页获取物理机列表
     * 
     * @param queryUserCondition
     * @return
     */
    List<HostDO> query(QueryHostCondition queryHostCondition);

}
