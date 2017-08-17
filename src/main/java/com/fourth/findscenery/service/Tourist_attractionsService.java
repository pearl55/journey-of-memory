package com.fourth.findscenery.service;

import com.fourth.lvyou.bean.Scenery;

import java.util.List;
import java.util.Map;

/**
 * Created by yu on 2017/8/7.
 */

public interface Tourist_attractionsService {
    //查询所有的景点
    List<Scenery> findTouristList1(Map<String, Object> map);
    /*//查询总条数
    int findCount(Map<String, Object> params);*/
    //根据价格排序查询
    List<Scenery> findAsc(Map<String, Object> map);


}
