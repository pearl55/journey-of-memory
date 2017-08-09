package com.fourth.service;

import com.fourth.bean.Address;
import com.fourth.bean.Route;
import com.fourth.bean.Scenery;

import java.util.List;

/**
 * Created by gaoyongpei on 2017/8/8.
 */
public interface RouteService {

    /*
    查询全部线路分类
     */
    public List<Route> getRoute(String routeNumber);

    /*
   查询景色
    */
    List<Scenery> getScenery(Scenery scenery);
    Address getAddress(String addressname);

}
