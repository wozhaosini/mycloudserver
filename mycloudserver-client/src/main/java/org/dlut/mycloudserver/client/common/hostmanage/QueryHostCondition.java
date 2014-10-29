/*
 * Copyright 2014 etao.com All right reserved. This software is the
 * confidential and proprietary information of etao.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with etao.com .
 */
package org.dlut.mycloudserver.client.common.hostmanage;

import java.io.Serializable;

/**
 * 类QueryUserCondition.java的实现描述：TODO 类实现描述
 * 
 * @author luojie 2014年10月22日 下午8:58:41
 */
public class QueryHostCondition implements Serializable {

    private static final long serialVersionUID = 1708961263436328093L;

    private Integer           hostId;

    private String            hostName;

    private String            hostIp;

    private HostStatusEnum    hostStatusEnum;

    private int               offset           = 0;

    private int               limit            = 10;

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        if (offset >= 0) {
            this.offset = offset;
        }
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        if (limit > 0) {
            this.limit = limit;
        }
    }

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
