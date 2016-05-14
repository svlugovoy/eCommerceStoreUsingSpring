package com.svlugovoy.estore.service.impl;

import com.svlugovoy.estore.dao.CartDao;
import com.svlugovoy.estore.model.Cart;
import com.svlugovoy.estore.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Sergey Lugovoy <svlugovoy@gmail.com> 14.05.2016.
 */

@Service
public class CartServiceImpl implements CartService {

    @Autowired
    private CartDao cartDao;

    @Override
    public Cart getCartById(int cartId) {

        return cartDao.getCartById(cartId);
    }

    @Override
    public void update(Cart cart) {

        cartDao.update(cart);
    }
}
