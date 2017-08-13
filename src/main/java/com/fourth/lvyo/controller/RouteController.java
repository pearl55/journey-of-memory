package com.fourth.lvyo.controller;

import com.fourth.lvyo.bean.OrderForm;
import com.fourth.lvyo.bean.Route;
import com.fourth.lvyo.bean.Scenery;
import com.fourth.lvyo.service.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * Created by gaoyongpei on 2017/8/8.
 */
@Controller
public class RouteController {


    @Autowired
    private RouteService routeService;


    @RequestMapping(method = RequestMethod.GET, value = "/lvyou/{routeNumber}")
    public String getRoute(@PathVariable("routeNumber") String routeNumber, Map<String, Object> map,Scenery scenery) {
        System.out.println("getroute------------------------" + routeNumber);
        List<Route> route = routeService.getRoute(routeNumber);
        List<Scenery> list = routeService.getScenery(scenery);
        map.put("scenery",list);
        map.put("list", route);
        return "lvYouXianLu2";
    }

    @RequestMapping("lvyou")
    public String getRoute2(Map<String, Object> map) {
        System.out.println("getroute+----------");
        List<Scenery> scenery = routeService.getSceneryFindAll();
        int tj = 2;
        int tj1= 7;
        Scenery sce = routeService.getSceneryById(tj);
        Scenery sce1 = routeService.getSceneryById(tj1);
        System.out.println(sce1.getScenery_Title()+"111111111");
        map.put("tuijian",sce);
        map.put("tuijian1",sce1);
        map.put("scenery",scenery);
        return "lvYouXianLu";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/line/{addressname}")
    public String getAddressname(@PathVariable("addressname") String addressname,Scenery scenery, Map<String, Object> map) {
        System.out.println("getAddressname------------------------" + addressname);
        scenery.setAname(addressname);
        List<Scenery> list = routeService.getScenery(scenery);
        map.put("scenery",list);
        return "lvYouXianLu2";
    }
    @RequestMapping("/tiaozhuan")
    public String getSceneryById(int id,Map<String, Object> map){
        System.out.println("getSceneryById");
        Scenery scenery = routeService.getSceneryById(id);
        boolean bl = false;
        if(scenery!=null){
            bl = true;
        }

        System.out.println(scenery.getScenery_Title());
        int scenery_price = scenery.getScenery_Price();
        int menshi = scenery_price + 350;
        int ertong = scenery_price - 700;
        scenery.setMenShi(menshi);
        scenery.setErTong(ertong);
        map.put("scenery",scenery);
        return "jingse";
    }

    @RequestMapping("GetOrderForm")
    public String getOrderForm(OrderForm orderForm){
        System.out.println(orderForm.getOrderform_Date());
        System.out.println("GetOrderForm");
        System.out.println(orderForm.getAdult_Num()+"111111111111111111");
        int number = orderForm.getAdult_Num() + orderForm.getChild_Num();
        int money = orderForm.getMoney();
        int cm = money-700;
        int A = orderForm.getAdult_Num() * money;
        int C = orderForm.getChild_Num()*cm;
        orderForm.setOrderform_Price(A+C);
        orderForm.setOrderform_Number(number);
        routeService.getOrderForm(orderForm);
        return "index2";
    }

}




