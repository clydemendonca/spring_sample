package com.pluralsight.service;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRespository;
import com.pluralsight.repository.HibernateCustomerRespositoryImpl;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {

    private CustomerRespository customerRespository = new HibernateCustomerRespositoryImpl();

    @Override
    public List<Customer> findAll() {
        return customerRespository.findAll();
    }

}
