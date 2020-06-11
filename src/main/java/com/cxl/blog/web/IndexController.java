package com.cxl.blog.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/")
    public String index() {
//        int i =9/0;     //主动注入500错误异常
        return "index";
    }
}
