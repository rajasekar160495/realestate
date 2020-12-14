package com.cooper.realestate.controller;

import com.cooper.realestate.model.Home;
import com.cooper.realestate.model.PropertiesViewCount;
import com.cooper.realestate.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @author rajasekar.sambandam created on 12/14/2020
 **/
@RestController
@RequestMapping("/reports")
public class ReportController {

    @Autowired
    private ReportService reportService;

    @GetMapping
    public List<PropertiesViewCount> getPropertiesWithCount(){
     return reportService.viewCounts();
    }
}
