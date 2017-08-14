package com.fourth.lvyo.service.serviceimpl;

import com.fourth.lvyo.bean.Address;
import com.fourth.lvyo.bean.OrderForm;
import com.fourth.lvyo.bean.Route;
import com.fourth.lvyo.bean.Scenery;
import com.fourth.lvyo.dao.RouteMapper;
import com.fourth.lvyo.service.RouteService;
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

    public List<Route> getRoute(String routeNumber) {

        System.out.println("service");
        return routeMapper.getRoute(routeNumber);
    }


    public List<Scenery> getScenery(Scenery scenery) {
        return routeMapper.getScenery(scenery);
    }

    @Override
    public Address getAddress(String addressname) {
        return routeMapper.getAddress(addressname);
    }

    @Override
    public Scenery getSceneryById(int id) {
        return routeMapper.getSceneryById(id);
    }

    @Override
    public void getOrderForm(OrderForm orderForm) {
        routeMapper.getOrderForm(orderForm);
    }

    @Override
    public List<Scenery> getSceneryFindAll() {
        return routeMapper.getSceneryFindAll();
    }


}
