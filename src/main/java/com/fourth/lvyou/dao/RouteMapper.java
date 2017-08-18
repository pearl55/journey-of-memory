package com.fourth.lvyou.dao;

import com.fourth.lvyou.bean.Address;
import com.fourth.lvyou.bean.OrderForm;
import com.fourth.lvyou.bean.Route;
import com.fourth.lvyou.bean.Scenery;
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

    List<Scenery> getRoute(String routeNumber);
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
