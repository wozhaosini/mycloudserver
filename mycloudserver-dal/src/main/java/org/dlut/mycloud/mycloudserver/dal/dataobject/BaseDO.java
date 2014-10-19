/*
 * Copyright 2014 etao.com All right reserved. This software is the
 * confidential and proprietary information of etao.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with etao.com .
 */
package org.dlut.mycloud.mycloudserver.dal.dataobject;

import java.util.Date;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * 类BaseDO.java的实现描述：TODO 类实现描述
 * 
 * @author luojie 2014年10月7日 下午11:18:21
 */
public class BaseDO {

    private Date gmtCreate;

    private Date gmtModified;

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
