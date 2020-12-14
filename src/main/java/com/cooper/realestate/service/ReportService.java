package com.cooper.realestate.service;

import com.cooper.realestate.model.Home;
import com.cooper.realestate.model.PropertiesViewCount;

import java.util.List;
import java.util.Map;

/**
 * @author rajasekar.sambandam created on 12/14/2020
 **/
public interface ReportService {
    List<PropertiesViewCount> viewCounts();
}
