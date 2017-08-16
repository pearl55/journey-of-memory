package com.fourth.chemiao.service;

import com.fourth.chemiao.bean.International_landmarik;
import com.fourth.chemiao.bean.Special_attractions;

import java.util.List;

public interface SpecialService {
    //查询国际景点
    List<International_landmarik> getQuerylandmarik(Integer id);
    //查询专题景点
    List<Special_attractions> getQueryAttractions_one(Integer id);
    //根据名称查找
    Special_attractions getQueryByName(String theme_name);
}
