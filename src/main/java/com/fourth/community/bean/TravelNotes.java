package com.fourth.community.bean;

import lombok.Data;

import java.util.Date;


/**
 * Created by 染熙 on 2017/8/8.
 * 游记表
 */
@Data
public class TravelNotes {
    private int n_id;
    private String n_headline;      //标题
    private String n_destination;   //目的地
    private String n_startDate;       //起始日期
    private String n_endDate;         //结束日期
    private String n_city;          //城市
    private String n_scenic;        //景点
    private String n_time_limit;    //旅游周期
    private String n_section_titles;//段落标题
    private String n_essay;         //文字内容
    private String n_picture;       //旅游景色照
    private Integer n_agreement;      //网络协议
    private Date n_releaseDate;       //发表日期
    private Date n_updateDate;          //更新日期
    private Integer n_page_view;      //浏览数
    private Integer n_commentnum;       //评论数
    private int user_id;          //用户ID

}
