package com.fourth.controller;

import com.fourth.bean.Address;
import com.fourth.bean.Route;
import com.fourth.bean.Scenery;
import com.fourth.service.RouteService;
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
    public String getRoute2(String routeNumber, Map<String, Object> map) {
        System.out.println("getroute2------------------------" + routeNumber);
        List<Route> route = routeService.getRoute(routeNumber);
        map.put("list", route);
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
    
}




