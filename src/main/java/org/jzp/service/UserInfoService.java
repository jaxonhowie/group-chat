package org.jzp.service;

import org.jzp.model.UserInfo;

import java.util.List;

/**
 * @author Hongyi Zheng
 * @date 2018/9/12
 */
public interface UserInfoService {
    List<UserInfo> verify(String username, String password);

}
