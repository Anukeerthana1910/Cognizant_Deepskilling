package com.cognizant.orm_learn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.orm_learn.model.Country1;

@Repository
public interface CountryRepository1 extends JpaRepository<Country1, String> {

}