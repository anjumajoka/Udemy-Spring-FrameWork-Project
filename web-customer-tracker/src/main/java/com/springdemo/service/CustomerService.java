package com.springdemo.service;

import com.springdemo.entity.Customer;

import java.util.List;

public interface CustomerService {

    List<Customer> customerList();

    void addCustomer(Customer theCustomer);

    Customer getCustomer(int theId);

    void deleteTheCustomer(int theId);

    List<Customer> getCustomerByName(String name);
}
