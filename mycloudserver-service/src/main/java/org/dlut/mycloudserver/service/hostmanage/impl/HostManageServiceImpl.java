/*
 * Copyright 2014 etao.com All right reserved. This software is the
 * confidential and proprietary information of etao.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with etao.com .
 */
package org.dlut.mycloudserver.service.hostmanage.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.dlut.mycloudserver.client.common.ErrorEnum;
import org.dlut.mycloudserver.client.common.MyCloudResult;
import org.dlut.mycloudserver.client.common.Pagination;
import org.dlut.mycloudserver.client.common.hostmanage.HostDTO;
import org.dlut.mycloudserver.client.common.hostmanage.QueryHostCondition;
import org.dlut.mycloudserver.client.service.hostmanage.IHostManageService;
import org.dlut.mycloudserver.dal.dataobject.HostDO;
import org.dlut.mycloudserver.service.hostmanage.HostManage;
import org.dlut.mycloudserver.service.hostmanage.convent.HostConvent;
import org.springframework.stereotype.Service;

/**
 * 类HostManageServiceImpl.java的实现描述：TODO 类实现描述
 * 
 * @author luojie 2014年10月29日 下午11:12:25
 */
@Service("hostManageService")
public class HostManageServiceImpl implements IHostManageService {

    @Resource
    private HostManage hostManage;

    /**
     * 根据id获取主机
     */
    @Override
    public MyCloudResult<HostDTO> getHostById(int hostId) {
        HostDO hostDO = hostManage.getHostById(hostId);
        return MyCloudResult.successResult(HostConvent.conventToHostDTO(hostDO));
    }

    /**
     * 创建主机, hostName和hostIp必填
     */
    @Override
    public MyCloudResult<Integer> createHost(HostDTO hostDTO) {
        HostDO hostDO = HostConvent.conventToHostDO(hostDTO);
        if (hostDO == null || StringUtils.isBlank(hostDO.getHostName()) || StringUtils.isBlank(hostDO.getHostIp())) {
            return MyCloudResult.failedResult(ErrorEnum.PARAM_NULL);
        }
        return MyCloudResult.successResult(hostManage.createHost(hostDO));
    }

    /**
     * hostId必填
     */
    @Override
    public MyCloudResult<Boolean> updateHost(HostDTO hostDTO) {
        HostDO hostDO = HostConvent.conventToHostDO(hostDTO);
        if (hostDO == null || hostDO.getHostId() == null) {
            return MyCloudResult.failedResult(ErrorEnum.PARAM_NULL);
        }
        return MyCloudResult.successResult(hostManage.updateHost(hostDO));
    }

    @Override
    public MyCloudResult<Boolean> deleteHostById(int hostId) {
        if (hostId <= 0) {
            return MyCloudResult.successResult(Boolean.FALSE);
        }
        return MyCloudResult.successResult(hostManage.deleteHostById(hostId));
    }

    @Override
    public MyCloudResult<Integer> countQuery(QueryHostCondition queryHostCondition) {
        if (queryHostCondition == null) {
            return MyCloudResult.failedResult(ErrorEnum.PARAM_NULL);
        }
        return MyCloudResult.successResult(hostManage.countQuery(queryHostCondition));
    }

    @Override
    public MyCloudResult<Pagination<HostDTO>> query(QueryHostCondition queryHostCondition) {
        if (queryHostCondition == null) {
            return MyCloudResult.failedResult(ErrorEnum.PARAM_NULL);
        }
        int totalCount = hostManage.countQuery(queryHostCondition);
        List<HostDO> hostDOList = hostManage.query(queryHostCondition);
        Pagination<HostDTO> pagination = new Pagination<HostDTO>(queryHostCondition.getOffset(),
                queryHostCondition.getLimit(), totalCount, HostConvent.conventToHostDTOList(hostDOList));
        return MyCloudResult.successResult(pagination);
    }
}
