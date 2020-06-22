package com.springdemo.repository;

import com.springdemo.entity.Customer;

import java.util.List;

public interface CustomerDAO {
    List<Customer> getCustomerList();

    void addCustomer(Customer theCustomer);

    Customer getCustomer(int theId);


    void deleteTheCustomer(int theId);

    List<Customer> searchCustomer(String name);
}
