package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/app")
public class TestController {

    @RequestMapping("/test")
    @ResponseBody
    public String testDemo() {
        System.out.println("1111");
        return "Hello World!";
    }

    @RequestMapping("/test1")
    @ResponseBody
    public String test1() {
        System.out.println("1111");
        return "Hello World!";
    }
}
