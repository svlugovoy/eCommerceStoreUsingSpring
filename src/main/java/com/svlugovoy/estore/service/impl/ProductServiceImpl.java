package com.svlugovoy.estore.service.impl;

import com.svlugovoy.estore.dao.ProductDao;
import com.svlugovoy.estore.model.Product;
import com.svlugovoy.estore.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Sergey Lugovoy <svlugovoy@gmail.com> 08.05.2016.
 */

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public List<Product> getProductList() {

        return productDao.getProductList();
    }

    @Override
    public Product getProductById(int id) {

        return productDao.getProductById(id);
    }

    @Override
    public void addProduct(Product product) {

        productDao.addProduct(product);
    }

    @Override
    public void editProduct(Product product) {

        productDao.editProduct(product);
    }

    @Override
    public void deleteProduct(Product product) {

        productDao.deleteProduct(product);
    }
}
