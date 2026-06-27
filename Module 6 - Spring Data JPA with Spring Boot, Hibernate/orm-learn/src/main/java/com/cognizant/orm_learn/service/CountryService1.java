package com.cognizant.orm_learn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.orm_learn.model.Country1;
import com.cognizant.orm_learn.repository.CountryRepository1;

import jakarta.transaction.Transactional;

@Service
public class CountryService1 {

    @Autowired
    private CountryRepository1 countryRepository;

    @Transactional
    public List<Country1> getAllCountries() {

        return countryRepository.findAll();

    }

}