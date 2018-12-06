package com.billy.test1206.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ho")
public class Test {
    @RequestMapping("/index")
    String index() {
        //mapped to hostname:port/home/index/
        return "老李是霸王龙！";
    }
}
