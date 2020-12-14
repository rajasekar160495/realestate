package com.cooper.realestate.enums;

/**
 * @author rajasekar.sambandam created on 12/14/2020
 **/
public enum PropertyType {
    VILLA("Villa"),
    TWOBHK("2BHK"),
    THREEBHK("3BHK"),
    INDIVIDUAL("Individual");

    private String propertyType;

    public String getPropertyType() {
        return propertyType;
    }

    PropertyType(String propertyType) {
        this.propertyType = propertyType;
    }
}
