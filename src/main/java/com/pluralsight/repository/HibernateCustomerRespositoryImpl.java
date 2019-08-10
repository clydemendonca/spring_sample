package com.pluralsight.repository;

import com.pluralsight.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class HibernateCustomerRespositoryImpl implements CustomerRespository {

    @Override
    public List<Customer> findAll() {
        List<Customer> customerList = new ArrayList<>();

        Customer customer = new Customer();
        customer.setFirstName("Clyde");
        customer.setLastName("Mendonca");

        customerList.add(customer);

        return customerList;
    }

}
