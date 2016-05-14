package com.svlugovoy.estore.dao;

import com.svlugovoy.estore.model.Cart;

/**
 * @author Sergey Lugovoy <svlugovoy@gmail.com> 05.05.2016.
 */


public interface CartDao {

    Cart getCartById(int cartId);

    void update(Cart cart);

}
