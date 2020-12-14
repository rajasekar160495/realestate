package com.cooper.realestate.model;

import java.math.BigDecimal;

/**
 * @author rajasekar.sambandam created on 12/14/2020
 **/

public class LoanBasicDetails {
    private String name;
    private String mobileNumber;
    private Integer noOfMonthsTenure;
    private BigDecimal totalPrice;
    private BigDecimal monthlyEmiAmount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public Integer getNoOfMonthsTenure() {
        return noOfMonthsTenure;
    }

    public void setNoOfMonthsTenure(Integer noOfMonthsTenure) {
        this.noOfMonthsTenure = noOfMonthsTenure;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public BigDecimal getMonthlyEmiAmount() {
        return monthlyEmiAmount;
    }

    public void setMonthlyEmiAmount(BigDecimal monthlyEmiAmount) {
        this.monthlyEmiAmount = monthlyEmiAmount;
    }
}
