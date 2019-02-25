package org.jzp.controller;

import org.jzp.service.biz.LoginService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author Hongyi Zheng
 * @date 2018/8/9
 */
@Controller
public class HomePage extends BaseController{

    @Autowired
    LoginService loginService;

    private static final Logger logger = LoggerFactory.getLogger(HomePage.class);

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String homepage() {
        return "login/home";
    }

    @RequestMapping(value = "/error", method = RequestMethod.GET)
    public String error(){
        return "error";
    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String validate(@RequestParam String username , @RequestParam String password){
        boolean isReg = loginService.verify(username, password);
        return "login/success";
    }
}
