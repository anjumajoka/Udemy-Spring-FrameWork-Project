package com.springdemo.repository;

import com.springdemo.entity.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class CustomerDAOImpl implements CustomerDAO{

    @Autowired
    private SessionFactory session;

    @Override
    public List<Customer> getCustomerList() {
        // get the current hibernate session
        Session currentSession = session.getCurrentSession();

        // create the query
        Query<Customer> theQuery = currentSession.createQuery("from Customer", Customer.class);

        // execute the query
        List<Customer> customers = theQuery.getResultList();

        // return the result
        return customers;
    }

    @Override
    public void addCustomer(Customer theCustomer) {
        // get current hibernate session
        Session currentSession =  session.getCurrentSession();

        // save the customer
        currentSession.saveOrUpdate(theCustomer);
    }

    @Override
    public Customer getCustomer(int theId) {
        Session currentSession = session.getCurrentSession();

        Customer theCustomer = currentSession.get(Customer.class, theId);

        return theCustomer;
    }

    @Override
    public void deleteTheCustomer(int theId) {
        Session currentSession = session.getCurrentSession();

        Query createQuery = currentSession.createQuery("delete from Customer where id=:customerId");

        createQuery.setParameter("customerId", theId);

        createQuery.executeUpdate();
    }

    @Override
    public List<Customer> searchCustomer(String name) {
        Session currentSession = session.getCurrentSession();

        Query theQuery = null;

        if (name != null && name.trim().length() > 0) {

            // search for firstName or lastName ... case insensitive
            theQuery =currentSession.createQuery("from Customer where lower(firstName) like :theName or lower(lastName) like :theName", Customer.class);
            theQuery.setParameter("theName", "%" + name.toLowerCase() + "%");

        }
        else {
            // theSearchName is empty ... so just get all customers
            theQuery =currentSession.createQuery("from Customer", Customer.class);
        }

        // execute query and get result list
        List<Customer> customers = theQuery.getResultList();

        // return the results
        return customers;

    }
}
