package com.cooper.realestate.service.impl;

import com.cooper.realestate.model.PropertiesViewCount;
import com.cooper.realestate.service.HomeService;
import com.cooper.realestate.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author rajasekar.sambandam created on 12/14/2020
 **/
@Service
public class ReportServiceImpl implements ReportService {
    @Autowired
    private HomeService homeService;
    @Override
    public List<PropertiesViewCount> viewCounts() {
         return homeService.getPropertyViewCounts().entrySet().stream().map(property->{
             PropertiesViewCount propertiesViewCount = new PropertiesViewCount();
             propertiesViewCount.setHomeId(property.getKey().getId());
             propertiesViewCount.setHomeName(property.getKey().getName());
             propertiesViewCount.setViewCount(property.getValue());
             return propertiesViewCount;
         }).collect(Collectors.toList());
    }
}
