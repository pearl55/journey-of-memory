package com.fourth.findscenery.dao;

import com.fourth.lvyou.bean.Scenery;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;


import java.util.List;
import java.util.Map;

/**
 * Created by yu on 2017/8/7.
 */
@Component
@Mapper
public interface Tourist_attractionsMapper {


   /* //查询总条数
    int findCount(Map<String, Object> params);*/
    //分页查询所有的景点
    List<Scenery> findTouristList1(Map<String, Object> map);
    //根据价格排序查询
    List<Scenery> findAsc(Map<String, Object> map);
    //查询所有数据
    List<Scenery> findList(Map<String, Object> map);





}
