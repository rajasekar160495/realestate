package com.cooper.realestate.model;

/**
 * @author rajasekar.sambandam created on 12/14/2020
 **/

public class HomeSaleRequestDTO {
    private Integer personId;
    private Integer homeId;
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
}
