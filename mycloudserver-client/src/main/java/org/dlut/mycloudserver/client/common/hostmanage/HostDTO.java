/*
 * Copyright 2014 etao.com All right reserved. This software is the
 * confidential and proprietary information of etao.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with etao.com .
 */
package org.dlut.mycloudserver.client.common.hostmanage;

import org.dlut.mycloudserver.client.common.BaseDTO;

/**
 * 类HostDTO.java的实现描述：TODO 类实现描述
 * 
 * @author luojie 2014年10月29日 下午11:15:21
 */
public class HostDTO extends BaseDTO {

    private static final long serialVersionUID = -1973198392650390569L;

    /**
     * 物理机id
     */
    private Integer           hostId;

    /**
     * 物理机名称
     */
    private String            hostName;

    /**
     * 物理机ip
     */
    private String            hostIp;

    /**
     * 物理机运行状态
     */
    private HostStatusEnum    hostStatusEnum;

    public Integer getHostId() {
        return hostId;
    }

    public void setHostId(Integer hostId) {
        this.hostId = hostId;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public String getHostIp() {
        return hostIp;
    }

    public void setHostIp(String hostIp) {
        this.hostIp = hostIp;
    }

    public HostStatusEnum getHostStatusEnum() {
        return hostStatusEnum;
    }

    public void setHostStatusEnum(HostStatusEnum hostStatusEnum) {
        this.hostStatusEnum = hostStatusEnum;
    }

}
