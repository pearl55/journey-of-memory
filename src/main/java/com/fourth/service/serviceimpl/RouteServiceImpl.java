package com.fourth.service.serviceimpl;

import com.fourth.bean.Route;
import com.fourth.dao.RouteMapper;
import com.fourth.service.RouteService;
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

    public List<Route> getRoute() {

        System.out.println("service");
        return routeMapper.getRoute();
    }
}
