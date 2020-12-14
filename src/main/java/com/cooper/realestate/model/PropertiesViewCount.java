package com.cooper.realestate.model;

/**
 * @author rajasekar.sambandam created on 12/14/2020
 **/

public class PropertiesViewCount {
    private Integer homeId;
    private String homeName;
    private Integer viewCount;

    public Integer getHomeId() {
        return homeId;
    }

    public void setHomeId(Integer homeId) {
        this.homeId = homeId;
    }

    public String getHomeName() {
        return homeName;
    }

    public void setHomeName(String homeName) {
        this.homeName = homeName;
    }

    public Integer getViewCount() {
        return viewCount;
    }

    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
    }
}
