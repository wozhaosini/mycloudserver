/*
 * Copyright 2014 etao.com All right reserved. This software is the
 * confidential and proprietary information of etao.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with etao.com .
 */
package org.dlut.mycloudserver.dal.dataobject;

/**
 * 类HostDO.java的实现描述：TODO 类实现描述
 * 
 * @author luojie 2014年10月28日 下午10:06:39
 */
public class HostDO extends BaseDO {

    /**
     * 物理机id
     */
    private Integer hostId;

    /**
     * 物理机名称
     */
    private String  hostName;

    /**
     * 物理机ip
     */
    private String  hostIp;

    /**
     * 物理机状态
     */
    private Integer hostStatus;

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

    public Integer getHostStatus() {
        return hostStatus;
    }

    public void setHostStatus(Integer hostStatus) {
        this.hostStatus = hostStatus;
    }

}
