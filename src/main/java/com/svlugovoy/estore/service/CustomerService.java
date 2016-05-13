package com.svlugovoy.estore.service;

import com.svlugovoy.estore.model.Customer;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Sergey Lugovoy <svlugovoy@gmail.com> 12.05.2016.
 */

public interface CustomerService {

    void addCustomer(Customer customer);

    Customer getCustomerById(int customerId);

    List<Customer> getAllCustomers();

    Customer getCustomerByUsername(String username);
}
