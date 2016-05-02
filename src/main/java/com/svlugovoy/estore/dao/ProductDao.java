package com.svlugovoy.estore.dao;

import com.svlugovoy.estore.model.Product;

import java.util.List;

/**
 * @author Sergey Lugovoy <svlugovoy@gmail.com> 02.05.2016.
 */
public interface ProductDao {

    void addProduct(Product product);

    Product getProductById(String id);

    List<Product> getAllProducts();

    void deleteProduct(String id);

}
