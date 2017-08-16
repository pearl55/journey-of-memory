package com.fourth.lvyo.service;

import com.fourth.lvyo.bean.Address;
import com.fourth.lvyo.bean.OrderForm;
import com.fourth.lvyo.bean.Route;
import com.fourth.lvyo.bean.Scenery;

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
    //根据id查询
    Scenery getSceneryById(int id);
    //添加订单
    void getOrderForm(OrderForm orderForm);
    //查询全部景色
    List<Scenery> getSceneryFindAll();
    //根据用户查订单
    List<OrderForm> getfindOrderForm();
    //删除根据id订单
    void deleteOrderForm(int id);

}
