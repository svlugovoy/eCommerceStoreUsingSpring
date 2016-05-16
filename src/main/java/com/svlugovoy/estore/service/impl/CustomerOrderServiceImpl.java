package com.svlugovoy.estore.service.impl;

import com.svlugovoy.estore.dao.CustomerOrderDao;
import com.svlugovoy.estore.model.Cart;
import com.svlugovoy.estore.model.CartItem;
import com.svlugovoy.estore.model.CustomerOrder;
import com.svlugovoy.estore.service.CartService;
import com.svlugovoy.estore.service.CustomerOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Sergey Lugovoy <svlugovoy@gmail.com> 16.05.2016.
 */

@Service
public class CustomerOrderServiceImpl implements CustomerOrderService {

    @Autowired
    CustomerOrderDao customerOrderDao;

    @Autowired
    CartService cartService;

    @Override
    public void addCustomerOrder(CustomerOrder customerOrder) {

        customerOrderDao.addCustomerOrder(customerOrder);
    }

    @Override
    public double getCustomerOrderGrandTotal(int cartId) {

        double grandTotal = 0;
        Cart cart = cartService.getCartById(cartId);
        List<CartItem> cartItems = cart.getCartItems();

        for (CartItem item : cartItems) {
            grandTotal += item.getTotalPrice();
        }

        return grandTotal;
    }
}
