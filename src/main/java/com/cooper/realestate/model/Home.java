package com.cooper.realestate.model;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * @author rajasekar.sambandam created on 12/14/2020
 **/

public class Home {
    private Integer id;
    private String name;
    private Address address;
    private Integer rating;
    private String typeOfProperty;
    private String status;
    private String ownerId;
    private BigDecimal price;

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTypeOfProperty() {
        return typeOfProperty;
    }

    public void setTypeOfProperty(String typeOfProperty) {
        this.typeOfProperty = typeOfProperty;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Home home = (Home) o;
        return Objects.equals(id, home.id) &&
                Objects.equals(name, home.name) &&
                Objects.equals(address, home.address) &&
                Objects.equals(rating, home.rating) &&
                Objects.equals(typeOfProperty, home.typeOfProperty) &&
                Objects.equals(status, home.status) &&
                Objects.equals(ownerId, home.ownerId) &&
                Objects.equals(price, home.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, address, rating, typeOfProperty, status, ownerId, price);
    }
}
