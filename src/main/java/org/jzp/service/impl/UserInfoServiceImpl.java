package org.jzp.service.impl;

import org.jzp.dao.UserInfoDao;
import org.jzp.model.UserInfo;
import org.jzp.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Hongyi Zheng
 * @date 2018/9/12
 */
@Service("userInfoServiceImpl")
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    UserInfoDao userInfoDao;

    @Override
    public List<UserInfo> verify(String username, String password) {
        return userInfoDao.verify(username, password);
    }
}

