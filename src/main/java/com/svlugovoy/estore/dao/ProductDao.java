package com.svlugovoy.estore.dao;

import com.svlugovoy.estore.model.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sergey Lugovoy <svlugovoy@gmail.com> 01.05.2016.
 */
public class ProductDao {

    private List<Product> productList;

    public List<Product> getProductList(){
        Product product1 = new Product();

        product1.setProductName("Camera1");
        product1.setProductCategory("Device");
        product1.setProductDescription("This is Canon start camera");
        product1.setProductPrice(200);
        product1.setProductCondition("new");
        product1.setProductStatus("Active");
        product1.setUnitInStock(11);
        product1.setProductManufacturer("Canon");

        productList = new ArrayList<Product>();
        productList.add(product1);

        return productList;
    }


}
