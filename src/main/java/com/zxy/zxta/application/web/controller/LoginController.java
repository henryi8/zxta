package com.zxy.zxta.application.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: zhaoxingyu
 * @Description: 登录登出
 * @Date 2018/6/21 10:10
 */
@Controller
public class LoginController extends BaseController{

    @RequestMapping("/login")
    public String login(){

        return "";
    }
}
