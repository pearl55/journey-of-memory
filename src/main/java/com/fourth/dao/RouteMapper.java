package com.fourth.dao;

import com.fourth.bean.Route;
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
    public List<Route> getRoute();

}
