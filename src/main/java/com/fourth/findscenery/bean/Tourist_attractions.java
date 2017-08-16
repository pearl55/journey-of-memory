package com.fourth.findscenery.bean;

import lombok.Data;

/**
 * Created by 水帅 on 2017/8/7.
 */
@Data
public class Tourist_attractions {

    private Integer scenery_Id;//景点id

    private String scenery_Title;//景点标题

    private String scenery_Introduce;//景点介绍

    private String scenery_Img;//景点图片

    private int scenery_Price;//景点价格

    private String sceneryPlan;//景点

    private String scenery_Fees;//景点费用说明

    private String scenery_Address;//景点地址

    private String scenery_Rode;//景点出行方式

    private String scenery_Day;//旅游天数

    private String scenery_Daytime;//出发时间

    private String scenery_Type;//景点类型

    private int address_Aid;//地址外键

    private String scenery_Num;////景点编号

    private int detailed_Did;//

    private Address address;//地址



    public Integer getScenery_Id() {
        return scenery_Id;
    }

    public void setScenery_Id(Integer scenery_Id) {
        this.scenery_Id = scenery_Id;
    }

    public String getScenery_Title() {
        return scenery_Title;
    }

    public void setScenery_Title(String scenery_Title) {
        this.scenery_Title = scenery_Title;
    }

    public String getScenery_Introduce() {
        return scenery_Introduce;
    }

    public void setScenery_Introduce(String scenery_Introduce) {
        this.scenery_Introduce = scenery_Introduce;
    }

    public String getScenery_Img() {
        return scenery_Img;
    }

    public void setScenery_Img(String scenery_Img) {
        this.scenery_Img = scenery_Img;
    }

    public int getScenery_Price() {
        return scenery_Price;
    }

    public void setScenery_Price(int scenery_Price) {
        this.scenery_Price = scenery_Price;
    }

    public String getSceneryPlan() {
        return sceneryPlan;
    }

    public void setSceneryPlan(String sceneryPlan) {
        this.sceneryPlan = sceneryPlan;
    }

    public String getScenery_Fees() {
        return scenery_Fees;
    }

    public void setScenery_Fees(String scenery_Fees) {
        this.scenery_Fees = scenery_Fees;
    }

    public String getScenery_Address() {
        return scenery_Address;
    }

    public void setScenery_Address(String scenery_Address) {
        this.scenery_Address = scenery_Address;
    }

    public String getScenery_Rode() {
        return scenery_Rode;
    }

    public void setScenery_Rode(String scenery_Rode) {
        this.scenery_Rode = scenery_Rode;
    }

    public String getScenery_Day() {
        return scenery_Day;
    }

    public void setScenery_Day(String scenery_Day) {
        this.scenery_Day = scenery_Day;
    }

    public String getScenery_Daytime() {
        return scenery_Daytime;
    }

    public void setScenery_Daytime(String scenery_Daytime) {
        this.scenery_Daytime = scenery_Daytime;
    }

    public String getScenery_Type() {
        return scenery_Type;
    }

    public void setScenery_Type(String scenery_Type) {
        this.scenery_Type = scenery_Type;
    }

    public int getAddress_Aid() {
        return address_Aid;
    }

    public void setAddress_Aid(int address_Aid) {
        this.address_Aid = address_Aid;
    }

    public String getScenery_Num() {
        return scenery_Num;
    }

    public void setScenery_Num(String scenery_Num) {
        this.scenery_Num = scenery_Num;
    }

    public int getDetailed_Did() {
        return detailed_Did;
    }

    public void setDetailed_Did(int detailed_Did) {
        this.detailed_Did = detailed_Did;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    }




