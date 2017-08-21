package com.fourth.lvyou.service.serviceimpl;

import com.fourth.lvyou.bean.Address;
import com.fourth.lvyou.bean.OrderForm;
import com.fourth.lvyou.bean.Route;
import com.fourth.lvyou.bean.Scenery;
import com.fourth.lvyou.dao.RouteMapper;
import com.fourth.lvyou.service.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by gaoyongpei on 2017/8/8.
 */
@Service
//@CacheConfig(cacheNames = {"routeCache"}) //可以指定key的生成器 如：keyGenerator = "keyGenerator" 这个与key是互斥的
@CacheConfig(cacheNames ="bangumis",keyGenerator ="keyGenerator")
public class RouteServiceImpl implements RouteService {

    @Autowired
    private RouteMapper routeMapper;

    @Cacheable(cacheNames = "getRoute",key="#routeNumber.toString()")
    public List<Scenery> getRoute(String routeNumber) {

        System.out.println("service");
        return routeMapper.getRoute(routeNumber);
    }

    @Cacheable(cacheNames = "getScenery",key="#scenery.toString()")
    public List<Scenery> getScenery(Scenery scenery) {
        return routeMapper.getScenery(scenery);
    }

    @Cacheable(cacheNames = "seneryByIde",key="#id.toString()")
    public Scenery getSceneryById(int id) {
        return routeMapper.getSceneryById(id);
    }

    public void getOrderForm(OrderForm orderForm) {
        routeMapper.getOrderForm(orderForm);
    }

    @Cacheable
    public List<Scenery> getSceneryFindAll() {
        this.routeMapper.getSceneryFindAll();
        return this.routeMapper.getSceneryFindAll();
    }

    //@Cacheable(cacheNames = "findOrderForm",key="#id.toString()")
    public List<OrderForm> getfindOrderForm(int id) {
        return routeMapper.getfindOrderForm(id);
    }

    public void deleteOrderForm(int id) {
        routeMapper.deleteOrderForm(id);
    }


}
