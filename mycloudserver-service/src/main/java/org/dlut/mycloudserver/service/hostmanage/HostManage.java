/*
 * Copyright 2014 etao.com All right reserved. This software is the
 * confidential and proprietary information of etao.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with etao.com .
 */
package org.dlut.mycloudserver.service.hostmanage;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.dlut.mycloudserver.client.common.hostmanage.QueryHostCondition;
import org.dlut.mycloudserver.dal.dataobject.HostDO;
import org.dlut.mycloudserver.dal.mapper.HostManageMapper;
import org.springframework.stereotype.Service;

/**
 * 类HostManage.java的实现描述：TODO 类实现描述
 * 
 * @author luojie 2014年10月29日 下午10:53:49
 */
@Service
public class HostManage {

    @Resource
    private HostManageMapper hostManageMapper;

    public HostDO getHostById(int hostId) {
        if (hostId <= 0) {
            return null;
        }
        return hostManageMapper.getHostById(hostId);
    }

    public int createHost(HostDO hostDO) {
        if (hostDO == null) {
            return 0;
        }
        return hostManageMapper.createHost(hostDO);
    }

    public boolean deleteHostById(int hostId) {
        if (hostId <= 0) {
            return false;
        }
        return hostManageMapper.deleteHostById(hostId) == 1;
    }

    /**
     * 更新主机
     * 
     * @param hostDO
     * @return
     */
    public boolean updateHost(HostDO hostDO) {
        if (hostDO == null) {
            return false;
        }
        return hostManageMapper.updateHost(hostDO) == 1;
    }

    public int countQuery(QueryHostCondition queryHostCondition) {
        if (queryHostCondition == null) {
            return 0;
        }
        return hostManageMapper.countQuery(queryHostCondition);
    }

    public List<HostDO> query(QueryHostCondition queryHostCondition) {
        if (queryHostCondition == null) {
            return new ArrayList<HostDO>();
        }
        return hostManageMapper.query(queryHostCondition);
    }
}
