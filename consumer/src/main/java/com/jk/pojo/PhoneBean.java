package com.jk.pojo;

import java.io.Serializable;

public class PhoneBean implements Serializable {

    private Integer id;
    private Integer type;
    private String name;
    private String sizi;
    private Double price;
    private String phonedate;
    private String sdate;
    private String edate;

    public String getSdate() {
        return sdate;
    }

    public void setSdate(String sdate) {
        this.sdate = sdate;
    }

    public String getEdate() {
        return edate;
    }

    public void setEdate(String edate) {
        this.edate = edate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSizi() {
        return sizi;
    }

    public void setSizi(String sizi) {
        this.sizi = sizi;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getPhonedate() {
        return phonedate;
    }

    public void setPhonedate(String phonedate) {
        this.phonedate = phonedate;
    }
}
