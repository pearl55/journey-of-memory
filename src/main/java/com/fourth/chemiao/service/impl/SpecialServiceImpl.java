package com.fourth.chemiao.service.impl;

import com.fourth.chemiao.bean.International_landmarik;
import com.fourth.chemiao.bean.Special_attractions;
import com.fourth.chemiao.mapper.SpecialMapper;
import com.fourth.chemiao.service.SpecialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpecialServiceImpl implements SpecialService{

    @Autowired
    private SpecialMapper specialMapper;

    @Override
    public List<International_landmarik> getQuerylandmarik(Integer id) {
        return specialMapper.getQuerylandmarik(id);
    }


    @Override
    public List<Special_attractions> getQueryAttractions_one(Integer id) {
        return specialMapper.getQueryAttractions(id);
    }

    @Override
    public Special_attractions getQueryByName(String theme_name) {
        return specialMapper.getQueryByName(theme_name);
    }

}
