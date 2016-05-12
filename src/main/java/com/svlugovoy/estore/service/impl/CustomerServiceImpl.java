package com.svlugovoy.estore.service.impl;

import com.svlugovoy.estore.dao.CustomerDao;
import com.svlugovoy.estore.model.Customer;
import com.svlugovoy.estore.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Sergey Lugovoy <svlugovoy@gmail.com> 12.05.2016.
 */

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerDao customerDao;

    @Override
    public void addCustomer(Customer customer) {

        customerDao.addCustomer(customer);
    }

    @Override
    public Customer getCustomerById(int customerId) {

        return customerDao.getCustomerById(customerId);
    }

    @Override
    public List<Customer> getAllCustomers() {

        return customerDao.getAllCustomers();
    }
}
