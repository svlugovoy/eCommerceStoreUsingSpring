package com.svlugovoy.estore.dao;

import com.svlugovoy.estore.model.Product;

import java.util.List;

/**
 * @author Sergey Lugovoy <svlugovoy@gmail.com> 02.05.2016.
 */
public interface ProductDao {

    List<Product> getProductList();

    Product getProductById(int id);

    void addProduct(Product product);

    void editProduct(Product product);

    void deleteProduct(Product product);

}
