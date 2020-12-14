package com.cooper.realestate.config;

import com.cooper.realestate.model.Address;
import com.cooper.realestate.model.Home;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

/**
 * @author rajasekar.sambandam created on 12/14/2020
 **/
@Configuration
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "mock-data")
public class HomeConfig {
    private List<Home> data;

    public List<Home> getData() {
        return data;
    }

    public void setData(List<Home> data) {
        this.data = data;
    }
}
