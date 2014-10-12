/*
 * Copyright 2014 etao.com All right reserved. This software is the
 * confidential and proprietary information of etao.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with etao.com .
 */
package org.dlut.mycloudserver.client.common;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * 类BaseDTO.java的实现描述：TODO 类实现描述
 * 
 * @author luojie 2014年10月12日 上午11:32:58
 */
public class BaseDTO implements Serializable {

    private static final long serialVersionUID = 336439024770228552L;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
