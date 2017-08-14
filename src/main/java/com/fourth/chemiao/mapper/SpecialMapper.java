package com.fourth.chemiao.mapper;

import com.fourth.chemiao.bean.International_landmarik;
import com.fourth.chemiao.bean.Special_attractions;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface SpecialMapper {
    //查询国际景点
    @Select("select * from international_landmark where sid=(select id from special where id=#{id})")
    List<International_landmarik> getQuerylandmarik(Integer id);

    //查询主题景点
    @Select("select * from special_attractions where sid=(select id from special where id=#{id})")
    List<Special_attractions> getQueryAttractions(Integer id);

    //查询单个景点
    @Select("select * from special_attractions where theme_name=#{theme_name}")
    Special_attractions getQueryByName(String theme_name);
}
