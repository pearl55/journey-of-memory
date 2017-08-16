package com.fourth.findscenery.bean;

import lombok.Data;

/**
 * Created by yu on 2017/8/8.
 */
@Data
public class Address {


    private Integer address_Id;

    private String address_Name;

    private int address_Route_Id;

    public Integer getAddress_Id() {
        return address_Id;
    }

    public void setAddress_Id(Integer address_Id) {
        this.address_Id = address_Id;
    }

    public String getAddress_Name() {
        return address_Name;
    }

    public void setAddress_Name(String address_Name) {
        this.address_Name = address_Name;
    }

    public int getAddress_Route_Id() {
        return address_Route_Id;
    }

    public void setAddress_Route_Id(int address_Route_Id) {
        this.address_Route_Id = address_Route_Id;
    }
}
