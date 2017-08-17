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
   //个人社区首页

    /*@RequestMapping("/individualCommunity")
    public String individualCommunity(HttpSession session, Model model){
        session.getAttribute(user1());
        if (user!=null){
            model.addAttribute("user",user);
            //用户已登录，返回展示个人信息和社区页面
            return "individual";
        }

         //没登录返回，游记攻略页面s

        return "";
    }*/
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


}
