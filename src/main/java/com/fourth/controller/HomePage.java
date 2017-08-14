package com.fourth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


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
    public String goHomePage(){
        return "index2";
    }



}
