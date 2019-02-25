package org.jzp.service.biz;

import org.jzp.model.UserInfo;
import org.jzp.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Hongyi Zheng
 * @date 2018/9/11
 */
@Component("loginService")
public class LoginService {

    @Autowired
    UserInfoService userInfoService;

    public boolean verify(String username, String password) {
        UserInfo userInfo ;
        return true;
    }
}
