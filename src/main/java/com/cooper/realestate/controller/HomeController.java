package com.cooper.realestate.controller;

import com.cooper.realestate.config.HomeConfig;
import com.cooper.realestate.model.Home;
import com.cooper.realestate.model.HomeSaleRequestDTO;
import com.cooper.realestate.model.Transaction;
import com.cooper.realestate.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @author rajasekar.sambandam created on 12/14/2020
 **/
@RestController
@RequestMapping("/home")
public class HomeController {


    @Autowired
    private HomeService homeService;

    @GetMapping
    public List<Home> getHomes(@RequestParam Map<String, String> requestParams) {
        return homeService.findHomes(requestParams);
    }

    @GetMapping("/{homeId}")
    public Home getHomes(@PathVariable("homeId") Integer homeId) {
        return homeService.getHomeDetailsByHomeId(homeId);
    }


    @PostMapping
    public List<Home> addNewHomes(@RequestBody List<Home> homeList) {
        return homeService.addNewHomes(homeList);
    }

    @PostMapping("/buy")
    public List<Transaction> buyHome(@RequestBody HomeSaleRequestDTO homeSaleRequestDTO){
        return homeService.buyHome(homeSaleRequestDTO);
    }

    @PostMapping("/request-details")
    public List<Transaction> requestToCallBack(@RequestBody HomeSaleRequestDTO homeSaleRequestDTO){
        return homeService.buyHome(homeSaleRequestDTO);
    }

}
