/*
 * Copyright 2014 etao.com All right reserved. This software is the
 * confidential and proprietary information of etao.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with etao.com .
 */
package org.dlut.mycloudserver.client.service.usermanage;

import org.dlut.mycloudserver.client.common.MyCloudResult;
import org.dlut.mycloudserver.client.common.Pagination;
import org.dlut.mycloudserver.client.common.usermanage.QueryUserCondition;
import org.dlut.mycloudserver.client.common.usermanage.RoleEnum;
import org.dlut.mycloudserver.client.common.usermanage.UserCreateReqDTO;
import org.dlut.mycloudserver.client.common.usermanage.UserDTO;

/**
 * 类IUserManageService.java的实现描述：TODO 类实现描述
 * 
 * @author luojie 2014年9月22日 下午10:44:28
 */
public interface IUserManageService {

    MyCloudResult<UserDTO> getUserByAccount(String account);

    /**
     * 验证用户是否合法
     * 
     * @param account
     * @param password
     * @param role
     * @return 如果合法，则返回userDTO，否则返回null
     */
    MyCloudResult<UserDTO> verifyAndGetUser(String account, String password, RoleEnum roleEnum);

    /**
     * 创建新用户，如果账号存在，则返回false
     * 
     * @param account
     * @param password
     * @param roleEnum
     * @return
     */
    MyCloudResult<Boolean> createUser(UserCreateReqDTO userCreateReqDTO);

    /**
     * 统计用户数量
     * 
     * @param queryUserCondition
     * @return
     */
    MyCloudResult<Integer> countQuery(QueryUserCondition queryUserCondition);

    /**
     * 分页查询用户
     * 
     * @param queryUserCondition
     * @return
     */
    MyCloudResult<Pagination<UserDTO>> query(QueryUserCondition queryUserCondition);

}
