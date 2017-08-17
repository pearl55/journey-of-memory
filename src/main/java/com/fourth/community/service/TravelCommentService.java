package com.fourth.community.service;

import com.fourth.community.bean.TravelComment;

import java.util.List;

/**
 * Created by 染熙 on 2017/8/16.
 */
public interface TravelCommentService {
    /*
    个人对个人游记的评论添加
     */
    void addTravelComment(TravelComment travelComment);
    /*
    查询游记下新添加的评论
     */
    TravelComment findTravelComment(int cid);
    /*
    查询所有的评论
     */
    List<TravelComment> findTravelCommentList(int notes_id);
}
