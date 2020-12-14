package com.cooper.realestate.model;

import java.util.List;

/**
 * @author rajasekar.sambandam created on 12/14/2020
 **/

public class Person {
    private Integer id;
    private String name;
    private String age;
    private List<Home> homeList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Home> getHomeList() {
        return homeList;
    }

    public void setHomeList(List<Home> homeList) {
        this.homeList = homeList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public List<Home> getHouseList() {
        return homeList;
    }

    public void setHouseList(List<Home> homeList) {
        this.homeList = homeList;
    }
}
