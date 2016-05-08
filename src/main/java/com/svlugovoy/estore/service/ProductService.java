package com.svlugovoy.estore.service;

import com.svlugovoy.estore.model.Product;

import java.util.List;

/**
 * @author Sergey Lugovoy <svlugovoy@gmail.com> 08.05.2016.
 */

public interface ProductService {

    List<Product> getProductList();

    Product getProductById(int id);

    void addProduct(Product product);

    void editProduct(Product product);

    void deleteProduct(Product product);

}
