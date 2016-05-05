package com.svlugovoy.estore.dao.impl;

import com.svlugovoy.estore.dao.CartDao;
import com.svlugovoy.estore.model.Cart;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Sergey Lugovoy <svlugovoy@gmail.com> 05.05.2016.
 */

@Repository
@Transactional
public class CartDaoImpl implements CartDao {

    private Map<String, Cart> listOfCarts;

    public CartDaoImpl() {
        listOfCarts = new HashMap<String, Cart>();
    }

    @Override
    public Cart create(Cart cart) {

        if (listOfCarts.keySet().contains(cart.getCartId())) {
            throw new IllegalArgumentException(String.format(
                    "Can not create a cart. A cart with given id(%) already exists.", cart.getCartId()));
        }
        listOfCarts.put(cart.getCartId(), cart);

        return cart;
    }

    @Override
    public Cart read(String cartId) {

        return listOfCarts.get(cartId);
    }

    @Override
    public void update(String cartId, Cart cart) {

        if (!listOfCarts.keySet().contains(cartId)){
            throw new IllegalArgumentException(String.format(
                    "Can not update cart. The cart with given id(%) does not exists.", cart.getCartId()));
        }
        listOfCarts.put(cartId, cart);
    }

    @Override
    public void delete(String cartId) {

        if (!listOfCarts.keySet().contains(cartId)){
            throw new IllegalArgumentException(String.format(
                    "Can not delete cart. The cart with given id(%) does not exists.", cartId));
        }
        listOfCarts.remove(cartId);
    }

}
