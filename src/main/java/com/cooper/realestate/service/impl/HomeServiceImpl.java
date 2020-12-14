package com.cooper.realestate.service.impl;

import com.cooper.realestate.config.HomeConfig;
import com.cooper.realestate.model.Home;
import com.cooper.realestate.model.HomeQueryRequestDTO;
import com.cooper.realestate.model.HomeSaleRequestDTO;
import com.cooper.realestate.model.LoanBasicDetails;
import com.cooper.realestate.model.Transaction;
import com.cooper.realestate.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author rajasekar.sambandam created on 12/14/2020
 **/
@Service
public class HomeServiceImpl implements HomeService {
    @Autowired
    private HomeConfig homeConfig;
    private Map<Integer, List<Transaction>> transactions = new HashMap<>();
    private Map<Home,Integer> viewCounts = new HashMap<>();

    @Override
    public List<Home> findHomes(Map<String, String> params) {
        List<Home> homeList = getHomes();
        if (StringUtils.hasText(params.get(STATUS)) && !CollectionUtils.isEmpty(homeList)) {
            homeList = homeList.stream().filter(home -> home.getOwnerId().equalsIgnoreCase(params.get(STATUS))).collect(Collectors.toList());
        }
        if (StringUtils.hasText(params.get(TYPE_OF_PROPERTY)) && !CollectionUtils.isEmpty(homeList)) {
            homeList = homeList.stream().filter(home -> home.getOwnerId().equalsIgnoreCase(params.get(TYPE_OF_PROPERTY))).collect(Collectors.toList());
        }
        if (StringUtils.hasText(params.get(SELLER_ID)) && !CollectionUtils.isEmpty(homeList)) {
            homeList = homeList.stream().filter(home -> home.getOwnerId().equalsIgnoreCase(params.get(SELLER_ID))).collect(Collectors.toList());
        }
        if (StringUtils.hasText(params.get(CITY)) && !CollectionUtils.isEmpty(homeList)) {
            homeList = homeList.stream().filter(home -> home.getAddress().getCity().equalsIgnoreCase(params.get(CITY))).collect(Collectors.toList());
        }
        if (StringUtils.hasText(params.get(AREA)) && !CollectionUtils.isEmpty(homeList)) {
            homeList = homeList.stream().filter(home -> home.getAddress().getArea().equalsIgnoreCase(params.get(AREA))).collect(Collectors.toList());
        }
        if (StringUtils.hasText(params.get(PIN_CODE)) && !CollectionUtils.isEmpty(homeList)) {
            homeList = homeList.stream().filter(home -> home.getAddress().getPinCode().equalsIgnoreCase(params.get(PIN_CODE))).collect(Collectors.toList());
        }
        homeList.sort((s1, s2) -> s2.getRating() - s1.getRating());
        return homeList;
    }

    @Override
    public Home getHomeDetailsByHomeId(Integer homeId) {
        List<Home> homeList = getHomes();
        Home homeDetails = homeList.stream().filter(home -> home.getId() == homeId).findAny().orElseThrow(RuntimeException::new);
        viewCounts.merge(homeDetails, 1, Integer::sum);
        return homeDetails;
    }

    private List<Home> getHomes() {
        return Optional.ofNullable(homeConfig.getData()).orElseGet(ArrayList::new);
    }

    @Override
    public List<Home> addNewHomes(List<Home> homeList) {
        List<Home> homes = this.getHomes();
        homes.addAll(homeList);
        return homeList;
    }

    @Override
    public List<Transaction> buyHome(HomeSaleRequestDTO homeSaleRequestDTO) {
        Home home = this.getHomes().stream().filter(homeItem -> homeItem.getId() == homeSaleRequestDTO.getHomeId() && homeItem.getStatus().equalsIgnoreCase("Available")).findFirst().orElseThrow(RuntimeException::new);
        home.setStatus("Sold");
        return getTransactions(homeSaleRequestDTO.getPersonId(), home.getId(), home.getPrice(), "Buy", homeSaleRequestDTO.getMobileNumber(), homeSaleRequestDTO.getMessage(), homeSaleRequestDTO.getLoanBasicDetails());
    }

    private List<Transaction> getTransactions(Integer personId, Integer homeId, BigDecimal price, String trxType, String mobileNumber, String message, LoanBasicDetails loanBasicDetails) {
        List<Transaction> transactionList = transactions.getOrDefault(personId, new ArrayList<>());
        Transaction transaction = new Transaction();
        transaction.setHomeId(homeId);
        transaction.setPersonId(personId);
        transaction.setPrice(price);
        transaction.setTrxType(trxType);
        transaction.setMessage(mobileNumber);
        transaction.setMobileNumber(message);
        transaction.setLoanBasicDetails(loanBasicDetails);
        transactionList.add(transaction);
        transactions.put(personId, transactionList);
        return transactionList;
    }

    @Override
    public void requestToCallback(HomeQueryRequestDTO homeQueryRequestDTO) {
        List<Transaction> transactionList = getTransactions(homeQueryRequestDTO.getPersonId(), homeQueryRequestDTO.getHomeId(), null, "Reserve", homeQueryRequestDTO.getMobileNumber(), homeQueryRequestDTO.getMessage(), homeQueryRequestDTO.getLoanBasicDetails());
    }

    @Override
    public Map<Home,Integer> getPropertyViewCounts() {
        return this.viewCounts;
    }

}
