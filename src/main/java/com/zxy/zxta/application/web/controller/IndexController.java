package com.zxy.zxta.application.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

    @RequestMapping("/hello")
    @ResponseBody
    public String he(){
        return "你好";
    }

}
