package com.svlugovoy.estore.service;

import com.svlugovoy.estore.model.Cart;

/**
 * @author Sergey Lugovoy <svlugovoy@gmail.com> 14.05.2016.
 */

public interface CartService {

    Cart getCartById(int cartId);

    void update(Cart cart);
}
