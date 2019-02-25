package org.jzp.controller;

import org.jzp.common.Constants;
import org.jzp.common.Result;
import org.jzp.common.RspCode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Administrator
 * @date 2018/9/11
 */
public class BaseController {
    protected final Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * 获取request
     */
    protected HttpServletRequest getRequest() {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        return request;
    }

    /**
     * 获取response
     */
    protected HttpServletResponse getResponse() {
        HttpServletResponse response = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getResponse();
        return response;
    }

    /**
     * 返回-成功但不返回数据
     */
    protected Result result() {
        return new Result();
    }

    /**
     * 返回-成功并返回数据
     */
    protected Result result(Object data) {
        return new Result(data);
    }

    /**
     * 返回-只返回错误码，用于异常情况
     */
    protected Result result(RspCode rspCode) {
        return new Result(rspCode);
    }

    /**
     * 返回-只返回错误码并自定义错误信息，用于异常情况
     */
    protected Result result(RspCode rspCode, String msg) {
        return new Result(rspCode, msg);
    }

    /**
     * 返回-用于需要同时返回状态码、信息、数据的情况
     */
    protected Result result(RspCode rspCode, String msg, Object data) {
        return new Result(rspCode, msg, data);
    }

    /**
     * 获取账户
     * @return
     */
//    protected String getAccount(){
//        String ticket = getRequest().getParameter(Constants.TICKET_COOKIE_KEY);
//        Cookie[] cookies = getRequest().getCookies();
//        if (ticket == null && cookies != null && cookies.length > 0) {
//            for (Cookie c : cookies) {
//                if (c.getName().equalsIgnoreCase(Constants.TICKET_COOKIE_KEY)) {
//                    ticket = c.getValue();
//                }
//            }
//        }
//        String redisKey = Constants.TICKET_REDIS_KEY_PREFIX + ticket;
//        String login =  (String)redisUtil.get(redisKey);
//        return login;
//    }

}
