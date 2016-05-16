package com.svlugovoy.estore.dao;

import com.svlugovoy.estore.model.Cart;

import java.io.IOException;

/**
 * @author Sergey Lugovoy <svlugovoy@gmail.com> 05.05.2016.
 */


public interface CartDao {

    Cart getCartById(int cartId);

    Cart validate(int cartId) throws IOException;

    void update(Cart cart);

}
