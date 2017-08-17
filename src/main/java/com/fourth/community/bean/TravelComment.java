package com.fourth.community.bean;

import lombok.Data;

import java.util.Date;

/**
 * Created by 染熙 on 2017/8/8.
 * 评论表
 */
@Data
public class TravelComment {
    private int cid;
    private String c_discuss;       //评价内容
    private String c_head;          //用户头像
    private String c_username;      //用户名
    private Date c_releaseDate;     //评论日期
    private int notes_id;           //游记表Id
}
