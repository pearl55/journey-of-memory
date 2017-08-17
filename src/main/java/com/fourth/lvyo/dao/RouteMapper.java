package com.fourth.lvyo.dao;

import com.fourth.lvyo.bean.Address;
import com.fourth.lvyo.bean.OrderForm;
import com.fourth.lvyo.bean.Route;
import com.fourth.lvyo.bean.Scenery;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
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
    //根据用户查订单
    List<OrderForm> getfindOrderForm(int id);
    //删除根据id订单
    void deleteOrderForm(int id);






}
