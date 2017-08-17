package com.fourth.community.service.imp;

import com.fourth.community.bean.TravelComment;
import com.fourth.community.mapper.TravelCommentMapper;
import com.fourth.community.service.TravelCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 染熙 on 2017/8/16.
 */
@Service
public class TravelCommentServiceImp implements TravelCommentService {
    @Autowired
    private TravelCommentMapper travelCommentMapper;

    @Override
    public void addTravelComment(TravelComment travelComment) {
        travelCommentMapper.addTravelComment(travelComment);
    }

    @Override
    public TravelComment findTravelComment(int cid) {
        return travelCommentMapper.findTravelComment(cid);
    }

    @Override
    public List<TravelComment> findTravelCommentList(int notes_id) {
        return travelCommentMapper.findTravelCommentList(notes_id);
    }
}
