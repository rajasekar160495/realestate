package com.cooper.realestate.model;

import java.math.BigDecimal;

/**
 * @author rajasekar.sambandam created on 12/14/2020
 **/

public class Transaction {
    private Integer personId;
    private Integer homeId;
    private BigDecimal price;
    private String trxType;
    private String mobileNumber;
    private String message;
    private LoanBasicDetails loanBasicDetails;

    public LoanBasicDetails getLoanBasicDetails() {
        return loanBasicDetails;
    }

    public void setLoanBasicDetails(LoanBasicDetails loanBasicDetails) {
        this.loanBasicDetails = loanBasicDetails;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTrxType() {
        return trxType;
    }

    public void setTrxType(String trxType) {
        this.trxType = trxType;
    }

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public Integer getHomeId() {
        return homeId;
    }

    public void setHomeId(Integer homeId) {
        this.homeId = homeId;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}

