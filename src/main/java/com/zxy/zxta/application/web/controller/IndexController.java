package com.zxy.zxta.application.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: zhaoxingyu
 * @Description: 首页
 * @Date 2018/6/21 10:10
 */
@Controller
public class IndexController extends BaseController{

    @RequestMapping("/hello")
    @ResponseBody
    public String he(){
        return "你好";
    }

}
