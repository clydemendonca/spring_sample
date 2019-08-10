package com.pluralsight.repository;

import com.pluralsight.model.Customer;

import java.util.List;

public interface CustomerRespository {
    List<Customer> findAll();
}
