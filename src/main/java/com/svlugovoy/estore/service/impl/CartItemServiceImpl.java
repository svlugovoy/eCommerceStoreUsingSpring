package com.svlugovoy.estore.service.impl;

import com.svlugovoy.estore.dao.CartItemDao;
import com.svlugovoy.estore.model.Cart;
import com.svlugovoy.estore.model.CartItem;
import com.svlugovoy.estore.service.CartItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Sergey Lugovoy <svlugovoy@gmail.com> 14.05.2016.
 */

@Service
public class CartItemServiceImpl implements CartItemService {

    @Autowired
    CartItemDao cartItemDao;

    @Override
    public void addCartItem(CartItem cartItem) {

        cartItemDao.addCartItem(cartItem);
    }

    @Override
    public void removeCartItem(CartItem cartItem) {

        cartItemDao.removeCartItem(cartItem);
    }

    @Override
    public void removeAllCartItems(Cart cart) {

        cartItemDao.removeAllCartItems(cart);
    }

    @Override
    public CartItem getCartItemByProductId(int productId) {

        return cartItemDao.getCartItemByProductId(productId);
    }
}
