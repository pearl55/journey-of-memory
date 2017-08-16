package com.fourth.findscenery.service;


import com.fourth.findscenery.bean.Tourist_attractions;
import com.fourth.findscenery.dao.Tourist_attractionsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Map;

/**
 * Created by yu on 2017/8/7.
 */
@Service
public class Tourist_attractionsServiceImpl implements Tourist_attractionsService{
    @Autowired
    private Tourist_attractionsMapper tourist_attractionsMapper;


    /*@Override
    public int findCount(Map<String, Object> params) {
       int count = tourist_attractionsMapper.findCount(params);
        return count;
    }*/

    @Override
    public List<Tourist_attractions> findAsc(Map<String, Object> map) {
        return tourist_attractionsMapper.findAsc(map);
    }

    @Override
    public List<Tourist_attractions> findTouristList1(Map<String, Object> map) {
        return tourist_attractionsMapper.findTouristList1(map);
    }
}
