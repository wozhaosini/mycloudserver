/*
 * Copyright 2014 etao.com All right reserved. This software is the
 * confidential and proprietary information of etao.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with etao.com .
 */
package org.dlut.mycloudserver.service.hostmanage.convent;

import java.util.ArrayList;
import java.util.List;

import org.dlut.mycloudserver.client.common.hostmanage.HostDTO;
import org.dlut.mycloudserver.client.common.hostmanage.HostStatusEnum;
import org.dlut.mycloudserver.dal.dataobject.HostDO;

/**
 * 类HostConvent.java的实现描述：TODO 类实现描述
 * 
 * @author luojie 2014年10月30日 下午10:55:46
 */
public class HostConvent {

    public static HostDTO conventToHostDTO(HostDO hostDO) {
        if (hostDO == null) {
            return null;
        }
        HostDTO hostDTO = new HostDTO();
        hostDTO.setHostId(hostDO.getHostId());
        hostDTO.setHostIp(hostDO.getHostIp());
        hostDTO.setHostName(hostDO.getHostName());
        hostDTO.setHostStatusEnum(HostStatusEnum.getHostByStatus(hostDO.getHostStatus()));

        return hostDTO;
    }

    public static HostDO conventToHostDO(HostDTO hostDTO) {
        if (hostDTO == null) {
            return null;
        }
        HostDO hostDO = new HostDO();
        hostDO.setHostId(hostDTO.getHostId());
        hostDO.setHostIp(hostDTO.getHostIp());
        hostDO.setHostName(hostDTO.getHostName());
        if (hostDTO.getHostStatusEnum() != null) {
            hostDO.setHostStatus(hostDTO.getHostStatusEnum().getStatus());
        } else {
            hostDO.setHostStatus(HostStatusEnum.CLOSED.getStatus());
        }
        return hostDO;
    }

    public static List<HostDTO> conventToHostDTOList(List<HostDO> hostDOList) {
        List<HostDTO> hostDTOList = new ArrayList<HostDTO>();
        if (hostDOList == null) {
            return hostDTOList;
        }
        for (HostDO hostDO : hostDOList) {
            hostDTOList.add(conventToHostDTO(hostDO));
        }
        return hostDTOList;
    }
}
