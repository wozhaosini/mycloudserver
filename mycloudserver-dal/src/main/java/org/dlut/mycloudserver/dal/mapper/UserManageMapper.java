/*
 * Copyright 2014 etao.com All right reserved. This software is the
 * confidential and proprietary information of etao.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with etao.com .
 */
package org.dlut.mycloudserver.dal.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.dlut.mycloudserver.client.common.usermanage.QueryUserCondition;
import org.dlut.mycloudserver.dal.dataobject.UserDO;

/**
 * 类UserManageMapper.java的实现描述：TODO 类实现描述
 * 
 * @author luojie 2014年10月7日 下午11:09:48
 */
public interface UserManageMapper {

    /**
     * 根据账号获取用户
     * 
     * @param account
     * @return
     */
    UserDO getUserByAccount(@Param("account") String account);

    /**
     * 创建用户
     * 
     * @param userDO
     * @return
     */
    int createUser(UserDO userDO);

    /**
     * 统计员工数量
     * 
     * @param queryUserCondition
     * @return
     */
    int countQuery(QueryUserCondition queryUserCondition);

    /**
     * 分页获取用户列表
     * 
     * @param queryUserCondition
     * @return
     */
    List<UserDO> query(QueryUserCondition queryUserCondition);
}
