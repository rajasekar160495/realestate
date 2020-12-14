package com.cooper.realestate.model;

/**
 * @author rajasekar.sambandam created on 12/14/2020
 **/

public class HomeQueryRequestDTO {
    private Integer personId;
    private Integer homeId;
    private String message;
    private String mobileNumber;
    private LoanBasicDetails loanBasicDetails;

    public LoanBasicDetails getLoanBasicDetails() {
        return loanBasicDetails;
    }

    public void setLoanBasicDetails(LoanBasicDetails loanBasicDetails) {
        this.loanBasicDetails = loanBasicDetails;
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

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
}
