package com.fourth.controller;

import com.fourth.bean.Route;
import com.fourth.service.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

/**
 * Created by gaoyongpei on 2017/8/8.
 */
@Controller
@RequestMapping("line")
public class RouteController {

    @Autowired
    private RouteService routeService;

    @RequestMapping("lvyou")
    public String getRoute(Map<String,Object> map){
        System.out.println("getroute------------------------");
        List<Route> route = routeService.getRoute();
        System.out.println(route);
        map.put("list",route);
        return "list";
    }
}
