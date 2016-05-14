package com.svlugovoy.estore.service;

import com.svlugovoy.estore.model.Cart;
import com.svlugovoy.estore.model.CartItem;
import com.svlugovoy.estore.model.Product;

/**
 * @author Sergey Lugovoy <svlugovoy@gmail.com> 14.05.2016.
 */
public interface CartItemService {

    void addCartItem(CartItem cartItem);

    void removeCartItem(CartItem cartItem);

    void removeAllCartItems(Cart cart);

    CartItem getCartItemByProductId(int productId);
}
