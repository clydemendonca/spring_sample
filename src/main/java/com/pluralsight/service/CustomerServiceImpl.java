package com.pluralsight.service;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRespository;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {

    private CustomerRespository customerRespository;

    @Override
    public List<Customer> findAll() {
        return customerRespository.findAll();
    }

    public void setCustomerRespository(CustomerRespository customerRespository) {
        this.customerRespository = customerRespository;
    }
}
