package com.fourth.User.controller;

import com.fourth.User.bean.User;
import com.fourth.User.service.UserService;
import com.fourth.User.util.MD5Util;
import com.fourth.User.util.RandomS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * Created by a on 2017/8/13.
 */
@Controller
public class UserController {
    @Autowired
    private UserService service;
    /**
     * 注册
     *
     */
    @RequestMapping("register.action")
    public String register(User user){

        String password=user.getPassword();
       /* System.out.print(password);*/
        String pwd=  MD5Util.MD5(password);
        //随机生成呢称
        String username= RandomS.getRandomString(8);
        user.setPassword(pwd);
        user.setUsername(username);
        user.setRole("普通");
        service.add(user);
        return "login";
    }
    /**
     * 登录
     */
    @RequestMapping("login.action")
    public String login(String deng, String password, HttpSession session, Model model){

        System.out.print(deng+"密码"+password);
        Map<String,Object> params=new HashMap<String,Object>();
       /* System.out.print(Phone+"---"+password);*/
        String pwd= MD5Util.MD5(password);
      /* System.out.print(pwd+"加密");*/
        params.put("deng",deng);
        params.put("password",pwd);
        User user= service.login(params);
        session.setAttribute("useri",user);
        String str=user.getDeng();
        String ss = str.substring(0,str.length()-(str.substring(3)).length())+"****"+str.substring(7);
        model.addAttribute("deng1",ss);
        if(user!=null) {
            if (user.getRole().equals("管理员")) {
                System.out.print("123");
                session.setAttribute("user1",user);
              /*   System.out.print("123"+user.getPhone());*/
                return "houtai";
            } else if(user.getRole().equals("普通")){
              /*   System.out.print("567");*/
                model.addAttribute("user",user);
             /*  session.setAttribute("user",user);*/
                return "index2";
            }
        }

        return "login";
    }
    /**
     * 判断是否登录进个人社区
     *
     */
    @RequestMapping("getShe.action")
    public String getShe(HttpServletRequest request, Model model){
        request.getSession().getAttribute("useri");
        if( request.getSession().getAttribute("useri")!=null){
            model.addAttribute("user", request.getSession().getAttribute("useri"));
            return "individual";
        }
        return "login";
    }


    /**
     *
     * 根据登录获取信息
     */
    @RequestMapping("getuser.action")
    public String getUser(String deng, Model model){
        User user=  service.getUser(deng);
        String str=user.getDeng();
        String ss = str.substring(0,str.length()-(str.substring(3)).length())+"****"+str.substring(7);
        model.addAttribute("deng1",ss);
        model.addAttribute("user",user);
        return "individual";
    }
    /**0
     *
     * 根据用户名获取用户全部信息
     */
    @RequestMapping("getHome.action")
    public String getHome(String deng, Model model){
        User user=  service.getHome(deng);
        String str=user.getDeng();
        String ss = str.substring(0,str.length()-(str.substring(3)).length())+"****"+str.substring(7);
        model.addAttribute("deng1",ss);
        model.addAttribute("user",user);
        return "success";
    }

    /*
   根据ID修改回显
    */
    @RequestMapping("findUserById.action")
    public @ResponseBody
    User findUserById(Integer id)
    {
        return service.findUserById(id);
    }
    /*
    验证修改时原密码是否一样
     */
    @RequestMapping("findUserByPassword.action")
    public @ResponseBody int findUserByPassword(String password){
        return service.findUserByPassword(password);
    }

    @RequestMapping("updateUser.action")
    public String updateUser(User user1, Model model, HttpServletRequest request, @RequestParam("file") MultipartFile file) throws Exception {
        // 原始名称
        String head = file.getOriginalFilename();
        // 上传图片
        if (file != null && head != null
                && head.length() > 0) {
            // 存储图片的物理路径
            //String pic_path = "E:\\img\\";
            //D://springboot.journey-of-memory/src/main/resource/static/img/
            String pic_path="D://springboot/journey-of-memory-master/src/main/resources/static/img/";
            // 新图片名称
            String newFileName = UUID.randomUUID()
                    + head.substring(head
                    .lastIndexOf("."));
            // 新图片
            File newFile = new File(pic_path + newFileName);
            // 将内存中的数据写入磁盘
            file.transferTo(newFile);
            // 将新图片名称写到itemsCustom中
            user1.setHead("../img/"+newFileName);
        }
        String password=MD5Util.MD5(user1.getPassword());
        user1.setPassword(password);
        service.updateUser(user1);
        /*User user = userServiceImp.findUserById(user1.getId());
        System.out.println(user1.getHead());
        model.addAttribute("user",user);*/
        return "individual";
    }

    /**
     *
     * 退出
     */
    @RequestMapping(value = "logout.action")
    public String logout(HttpSession session) throws Exception {
        // 清除Session
        session.invalidate();
        return "index2";
    }
    /*
     ajax检测登录
     */
    @RequestMapping("ceshi")
    @ResponseBody
    public int jiance(HttpSession session){
        int  id= 0;
        User user = user = (User) session.getAttribute("useri");
        System.out.println("----------ceshi");
        if(user!=null){
           id = user.getId();
            //System.out.println("id="+id);
            return id;
        }else{
            //System.out.println("空");
            return id;
        }
    };
}
