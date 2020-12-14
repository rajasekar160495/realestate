package com.cooper.realestate.service;

import com.cooper.realestate.model.Home;
import com.cooper.realestate.model.HomeQueryRequestDTO;
import com.cooper.realestate.model.HomeSaleRequestDTO;
import com.cooper.realestate.model.Transaction;

import java.util.List;
import java.util.Map;

/**
 * @author rajasekar.sambandam created on 12/14/2020
 **/
public interface HomeService {
    String PIN_CODE="pinCode";
    String AREA="area";
    String CITY="city";
    String SELLER_ID = "sellerId";
    String TYPE_OF_PROPERTY = "typeOfProperty";
    String STATUS = "status";
    List<Home> findHomes(Map<String,String> requestParams);
    Home getHomeDetailsByHomeId(Integer homeId);
    List<Home> addNewHomes(List<Home> homeList);
    List<Transaction> buyHome(HomeSaleRequestDTO homeSaleRequestDTO);
    void requestToCallback(HomeQueryRequestDTO homeQueryRequestDTO);
    Map<Home,Integer> getPropertyViewCounts();
}
