/*
 * Copyright 2014 etao.com All right reserved. This software is the
 * confidential and proprietary information of etao.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with etao.com .
 */
package org.dlut.mycloudserver.service.hostmanage;

import org.springframework.stereotype.Service;

/**
 * 类HostPerformanceJob.java的实现描述：TODO 类实现描述
 * 
 * @author luojie 2014年11月3日 下午10:10:37
 */
@Service
public class HostPerformanceFetchJob {

    public void execute() {
        System.out.println("haha");
        System.out.println(this);
    }
}
