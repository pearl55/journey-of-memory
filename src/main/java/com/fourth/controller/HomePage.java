package com.fourth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class HomePage {

    @RequestMapping("homepage")
    public String goHomePage() {
        return "index2";
    }

}
