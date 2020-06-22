package com.springdemo.service;

import com.springdemo.entity.Customer;
import com.springdemo.repository.CustomerDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class
CustomerServiceImpl implements CustomerService{

    @Autowired
    private CustomerDAO customerDAO;

    @Override
    @Transactional
    public List<Customer> customerList() {
        return customerDAO.getCustomerList();
    }

    @Override
    @Transactional
    public void addCustomer(Customer theCustomer) {
        customerDAO.addCustomer(theCustomer);
    }

    @Override
    @Transactional
    public Customer getCustomer(int theId) {
        return customerDAO.getCustomer(theId);
    }

    @Override
    @Transactional
    public void deleteTheCustomer(int theId) {
        customerDAO.deleteTheCustomer(theId);
    }

    @Override
    @Transactional
    public List<Customer> getCustomerByName(String name) {
        return customerDAO.searchCustomer(name);
    }
}
