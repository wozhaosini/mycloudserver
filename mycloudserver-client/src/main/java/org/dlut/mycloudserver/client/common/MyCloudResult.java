/*
 * Copyright 2014 etao.com All right reserved. This software is the
 * confidential and proprietary information of etao.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with etao.com .
 */
package org.dlut.mycloudserver.client.common;

import java.io.Serializable;

/**
 * 类UCloudResult.java的实现描述：TODO 类实现描述
 * 
 * @author luojie 2014年9月22日 下午11:49:05
 */
public class MyCloudResult<T> implements Serializable {

    private static final long serialVersionUID = -3404886040638951329L;

    protected boolean         success;

    protected T               model;

    protected String          msgCode;

    protected String          msgInfo;

    public MyCloudResult() {

    }

    public MyCloudResult(boolean success, String msgCode, String msgInfo) {
        this.success = success;
        this.msgCode = msgCode;
        this.msgInfo = msgInfo;
    }

    public static <T> MyCloudResult<T> successResult(T t) {
        MyCloudResult<T> result = new MyCloudResult<T>();
        result.setSuccess(true);
        result.setModel(t);
        return result;
    }

    public static <T> MyCloudResult<T> failedResult(String msgCode, String msgInfo) {
        MyCloudResult<T> result = new MyCloudResult<T>();
        result.setSuccess(false);
        result.setMsgCode(msgCode);
        result.setMsgInfo(msgInfo);
        return result;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public T getModel() {
        return model;
    }

    public void setModel(T model) {
        this.model = model;
    }

    public String getMsgCode() {
        return msgCode;
    }

    public void setMsgCode(String msgCode) {
        this.msgCode = msgCode;
    }

    public String getMsgInfo() {
        return msgInfo;
    }

    public void setMsgInfo(String msgInfo) {
        this.msgInfo = msgInfo;
    }

}
