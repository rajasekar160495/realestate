package com.cooper.realestate.model;

/**
 * @author rajasekar.sambandam created on 12/14/2020
 **/

public class SearchHomeDTO {
    private String area;
    private String pinCode;
    private String city;

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
