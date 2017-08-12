package com.fourth.dao;

import com.fourth.bean.Address;
import com.fourth.bean.OrderForm;
import com.fourth.bean.Route;
import com.fourth.bean.Scenery;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by gaoyongpei on 2017/8/8.
 */
@Mapper
@Component
public interface RouteMapper {

    /*
    查询全部线路分类
     */
    List<Route> getRoute(String routeNumber);
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






}
