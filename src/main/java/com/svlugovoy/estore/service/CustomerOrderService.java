package com.svlugovoy.estore.service;

import com.svlugovoy.estore.model.CustomerOrder;

/**
 * @author Sergey Lugovoy <svlugovoy@gmail.com> 16.05.2016.
 */
public interface CustomerOrderService {

    void addCustomerOrder(CustomerOrder customerOrder);

    double getCustomerOrderGrandTotal(int cartId);
}
