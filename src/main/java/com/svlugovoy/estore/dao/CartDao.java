package com.svlugovoy.estore.dao;

import com.svlugovoy.estore.model.Cart;

/**
 * @author Sergey Lugovoy <svlugovoy@gmail.com> 05.05.2016.
 */


public interface CartDao {

    Cart create(Cart cart);

    Cart read(String cartId);

    void update(String cartId, Cart cart);

    void delete(String cartId);

}
