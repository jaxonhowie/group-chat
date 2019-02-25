package org.jzp.dao;

import org.apache.ibatis.annotations.Mapper;
import org.jzp.model.UserInfo;

import java.util.List;

/**
 * @author Hongyi Zheng
 * @date 2018/9/12
 */
@Mapper
public interface UserInfoDao {
    /**
     * 用户登录校验
     * @param username 用户名
     * @param password 密码
     * @return
     */
    List<UserInfo> verify(String username, String password);
}
