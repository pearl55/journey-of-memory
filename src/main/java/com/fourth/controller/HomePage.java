package com.fourth.controller;

import com.fourth.User.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;


import java.util.HashMap;

import java.util.Map;


@Controller
public class HomePage {
    /**
     *
     * 进入首页
     */
//    @RequestMapping("homepage.action")
//    public String goHomePage(){
//        return "index2";
//    }
    @RequestMapping("/")
    public String goHomePage(HttpSession session, Map<String,Object> map){


        session.setAttribute("map",map);
        String deng1 = (String) session.getAttribute("deng1");
        map.put("deng1",deng1);
        return "index2";
    }
    /**
     * 后台管理
     */
    @RequestMapping("/admin")
    public String map(){
        return "index";
    }

    /**
     * 目的地
     */
    @RequestMapping("/map")
    public String map1(){
        return "map22";
    }
    /*
    足迹页面
     */
    @RequestMapping("/maptrack")
    public String track(HttpSession session, Map<String,Object> map){
        String deng1 = (String) session.getAttribute("deng1");
        map.put("deng1",deng1);
        return "map";
    }


}
