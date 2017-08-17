package com.fourth.lvyo.controller;

import com.fourth.User.bean.User;
import com.fourth.lvyo.bean.OrderForm;
import com.fourth.lvyo.bean.Route;
import com.fourth.lvyo.bean.Scenery;
import com.fourth.lvyo.service.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

/**
 * Created by gaoyongpei on 2017/8/8.
 */
@Controller
public class RouteController {


    @Autowired
    private RouteService routeService;


    /*
    根据线路查询
     */
    @RequestMapping(method = RequestMethod.GET, value = "/lvyou/{routeNumber}")
    public String getRoute(@PathVariable("routeNumber") String routeNumber, Map<String, Object> map,Scenery scenery,HttpSession session) {
        System.out.println("getroute------------------------" + routeNumber);
        List<Route> route = routeService.getRoute(routeNumber);
        List<Scenery> list = routeService.getScenery(scenery);

        String deng1 = (String) session.getAttribute("deng1");
        map.put("deng1",deng1);

        map.put("scenery",list);
        map.put("list", route);
        return "lvYouXianLu2";
    }
    /*
    点击旅游首页
     */
    @RequestMapping("lvyou")
    public String getRoute2(Map<String, Object> map, HttpSession session) {
        System.out.println("getroute+----------");
        List<Scenery> scenery = routeService.getSceneryFindAll();
        int tj = 2;
        int tj1= 7;
        Scenery sce = routeService.getSceneryById(tj);
        Scenery sce1 = routeService.getSceneryById(tj1);

        String deng1 = (String) session.getAttribute("deng1");
        map.put("deng1",deng1);

        map.put("tuijian",sce);
        map.put("tuijian1",sce1);
        map.put("scenery",scenery);
        return "lvYouXianLu";
    }

    /*
    根据地区查询
     */
    @RequestMapping(method = RequestMethod.GET, value = "/line/{addressname}")
    public String getAddressname(@PathVariable("addressname") String addressname,Scenery scenery, Map<String, Object> map,HttpSession session) {
        System.out.println("getAddressname------------------------" + addressname);
        scenery.setAname(addressname);
        List<Scenery> list = routeService.getScenery(scenery);
        String deng1 = (String) session.getAttribute("deng1");
        map.put("deng1",deng1);
        map.put("scenery",list);
        return "lvYouXianLu2";
    }
    /*
    根据id查询一个
     */
    @RequestMapping("/tiaozhuan")
    public String getSceneryById(int id,Map<String, Object> map,HttpSession session){
        System.out.println("tiaozhuan---------------------------");
        Scenery scenery = routeService.getSceneryById(id);
        int scenery_price = scenery.getScenery_Price();
        int menshi = scenery_price + 350;
        int ertong = scenery_price - 700;
        scenery.setMenShi(menshi);
        scenery.setErTong(ertong);

        String deng1 = (String) session.getAttribute("deng1");
        map.put("deng1",deng1);
        map.put("scenery",scenery);
        return "jingse";
    }

    /*
       订单
     */
    @RequestMapping("/GetOrderForm")
    public String getOrderForm(OrderForm orderForm){
        System.out.println("GetOrderForm-------------------------");
        int number = orderForm.getAdult_Num() + orderForm.getChild_Num();
        int money = orderForm.getMoney();
        int cm = money-700;
        int A = orderForm.getAdult_Num() * money;
        int C = orderForm.getChild_Num()*cm;
        orderForm.setOrderform_Price(A+C);
        orderForm.setOrderform_Number(number);
        System.out.println(orderForm.getUser_Id()+"11111111");
        routeService.getOrderForm(orderForm);
        return "forward:/";
    }
    /*
    进入订单页面
     */
    @RequestMapping("/dingdan")
    public String findDindan(Map<String,Object> map,HttpSession session){
        System.out.println("--------diandan------------");
        User useri = (User) session.getAttribute("useri");
        List<OrderForm> list = routeService.getfindOrderForm(useri.getId());
        String deng1 = (String) session.getAttribute("deng1");
        map.put("deng1",deng1);
        map.put("dingdan",list);
        return "dingdan";
    }
    /*
    根据id取消订单
     */
    @RequestMapping("/deleteOrderForm")
    public String deleteOrderForm(int id){
        System.out.println("--------Deletediandan------------");
       routeService.deleteOrderForm(id);
        return "forward:dingdan";
    }

}




