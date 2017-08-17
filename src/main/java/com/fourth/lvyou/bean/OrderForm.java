package com.fourth.lvyou.bean;

import lombok.Data;

/**
 * Created by gaoyongpei on 2017/8/10.
 */
@Data
public class OrderForm {
    private int orderform_Id;
    private int orderform_Number;
    private int orderform_Price;
    private String orderform_Day;
    private String orderform_Date;
    private String orderform_Address;
    private String orderform_Title;
    private String orderform_Rode;
    private String orderform_Type;
    private int user_Id;

    private int adult_Num;
    private int child_Num;
    private int Money;
}
