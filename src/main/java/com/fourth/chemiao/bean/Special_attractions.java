package com.fourth.chemiao.bean;

public class Special_attractions {
    private Integer id;//ID
    private String theme;//主题
    private String theme_photo;//主题景点照片
    private String theme_name;//主题景点名称
    private Double theme_money;//主题景点价格
    private String theme_synopsis;//主题景点简介
    private Integer sid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getTheme_photo() {
        return theme_photo;
    }

    public void setTheme_photo(String theme_photo) {
        this.theme_photo = theme_photo;
    }

    public String getTheme_name() {
        return theme_name;
    }

    public void setTheme_name(String theme_name) {
        this.theme_name = theme_name;
    }

    public Double getTheme_money() {
        return theme_money;
    }

    public void setTheme_money(Double theme_money) {
        this.theme_money = theme_money;
    }

    public String getTheme_synopsis() {
        return theme_synopsis;
    }

    public void setTheme_synopsis(String theme_synopsis) {
        this.theme_synopsis = theme_synopsis;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

}
