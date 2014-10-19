/*
 * Copyright 2014 etao.com All right reserved. This software is the
 * confidential and proprietary information of etao.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with etao.com .
 */
package org.dlut.mycloud.mycloudserver.dal.mapper;

import org.apache.ibatis.annotations.Param;
import org.dlut.mycloud.mycloudserver.dal.dataobject.UserDO;

/**
 * 类UserManageMapper.java的实现描述：TODO 类实现描述
 * 
 * @author luojie 2014年10月7日 下午11:09:48
 */
public interface UserManageMapper {

    UserDO getUserByAccount(@Param("account") String account);
}
