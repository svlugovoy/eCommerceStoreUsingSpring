package com.svlugovoy.estore.dao.impl;

import com.svlugovoy.estore.dao.CartDao;
import com.svlugovoy.estore.model.Cart;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;

/**
 * @author Sergey Lugovoy <svlugovoy@gmail.com> 05.05.2016.
 */

@Repository
@Transactional
public class CartDaoImpl implements CartDao {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public Cart getCartById(int cartId) {

        Session session = sessionFactory.getCurrentSession();

        return (Cart) session.get(Cart.class, cartId);
    }

    @Override
    public Cart validate(int cartId) throws IOException {

        Cart cart = getCartById(cartId);
        if (cart == null || cart.getCartItems().size() == 0) {
            throw new IOException(cartId + "");
        }
        update(cart);

        return cart;
    }

    @Override
    public void update(Cart cart) {

        int cartId = cart.getCartId();
        //to do later
    }
}