package com.svlugovoy.estore.dao;

import com.svlugovoy.estore.model.Customer;

import java.util.List;

/**
 * @author Sergey Lugovoy <svlugovoy@gmail.com> 12.05.2016.
 */

public interface CustomerDao {

    void addCustomer(Customer customer);

    Customer getCustomerById(int customerId);

    List<Customer> getAllCustomers();
}
