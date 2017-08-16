package com.fourth.findscenery.util;

/**
 * Created by yu on 2017/8/15.
 */
public class PageCount {
    String address_Name;
    Integer CurrentPage;
    Integer PageSize;

    public String getAddress_Name() {
        return address_Name;
    }

    public void setAddress_Name(String address_Name) {
        this.address_Name = address_Name;
    }

    public Integer getCurrentPage() {
        return CurrentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        CurrentPage = currentPage;
    }

    public Integer getPageSize() {
        return PageSize;
    }

    public void setPageSize(Integer pageSize) {
        PageSize = pageSize;
    }
}
