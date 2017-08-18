package com.fourth.lvyou.service.serviceimpl;

import com.fourth.lvyou.bean.Address;
import com.fourth.lvyou.bean.OrderForm;
import com.fourth.lvyou.bean.Route;
import com.fourth.lvyou.bean.Scenery;
import com.fourth.lvyou.dao.RouteMapper;
import com.fourth.lvyou.service.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by gaoyongpei on 2017/8/8.
 */
@Service
public class RouteServiceImpl implements RouteService {

    @Autowired
    private RouteMapper routeMapper;


    public List<Scenery> getRoute(String routeNumber) {

        System.out.println("service");
        return routeMapper.getRoute(routeNumber);
    }


    public List<Scenery> getScenery(Scenery scenery) {
        return routeMapper.getScenery(scenery);
    }


    public Address getAddress(String addressname) {
        return routeMapper.getAddress(addressname);
    }


    public Scenery getSceneryById(int id) {
        return routeMapper.getSceneryById(id);
    }


    public void getOrderForm(OrderForm orderForm) {
        routeMapper.getOrderForm(orderForm);
    }


    public List<Scenery> getSceneryFindAll() {
        return routeMapper.getSceneryFindAll();
    }


    public List<OrderForm> getfindOrderForm(int id) {
        return routeMapper.getfindOrderForm(id);
    }


    public void deleteOrderForm(int id) {
        routeMapper.deleteOrderForm(id);
    }


}
