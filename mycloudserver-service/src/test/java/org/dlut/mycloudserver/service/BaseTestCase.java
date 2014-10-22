/*
 * Copyright 2014 etao.com All right reserved. This software is the
 * confidential and proprietary information of etao.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with etao.com .
 */
package org.dlut.mycloudserver.service;

import java.util.List;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 类BaseTestCase.java的实现描述：TODO 类实现描述
 * 
 * @author luojie 2014年10月22日 下午11:32:47
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:test-context.xml")
public abstract class BaseTestCase {

    public <T> void printList(List<T> list) {
        if (list == null) {
            System.out.println("list is num");
            return;
        }

        System.out.println(list.size());
        for (T t : list) {
            System.out.println(t);
        }
    }

    public <T> void printObject(T t) {
        System.out.println(t);
    }
}
