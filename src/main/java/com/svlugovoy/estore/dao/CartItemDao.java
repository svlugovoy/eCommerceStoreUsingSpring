package com.svlugovoy.estore.dao;

import com.svlugovoy.estore.model.Cart;
import com.svlugovoy.estore.model.CartItem;

/**
 * @author Sergey Lugovoy <svlugovoy@gmail.com> 14.05.2016.
 */
public interface CartItemDao {

    void addCartItem(CartItem cartItem);

    void removeCartItem(CartItem cartItem);

    void removeAllCartItems(Cart cart);

    CartItem getCartItemByProductId(int productId);
}
