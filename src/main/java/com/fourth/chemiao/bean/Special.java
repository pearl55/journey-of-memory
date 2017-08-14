package com.fourth.chemiao.bean;

import java.util.List;

public class Special {
    private Integer id;
    private String special_name;
    private List<International_landmarik> int_lan;
    private List<Special_attractions> spe_attractions;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSpecial_name() {
        return special_name;
    }

    public void setSpecial_name(String special_name) {
        this.special_name = special_name;
    }

    public List<International_landmarik> getInt_lan() {
        return int_lan;
    }

    public void setInt_lan(List<International_landmarik> int_lan) {
        this.int_lan = int_lan;
    }

    public List<Special_attractions> getSpe_attractions() {
        return spe_attractions;
    }

    public void setSpe_attractions(List<Special_attractions> spe_attractions) {
        this.spe_attractions = spe_attractions;
    }
}
