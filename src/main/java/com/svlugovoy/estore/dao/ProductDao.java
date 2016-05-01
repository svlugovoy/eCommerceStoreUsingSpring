package com.svlugovoy.estore.dao;

import com.svlugovoy.estore.model.Product;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Sergey Lugovoy <svlugovoy@gmail.com> 01.05.2016.
 */
public class ProductDao {

    private List<Product> productList;

    public List<Product> getProductList() {
        Product product1 = new Product();

        product1.setProductId("1");
        product1.setProductName("Camera1");
        product1.setProductCategory("Device");
        product1.setProductDescription("This is Canon start camera");
        product1.setProductPrice(200);
        product1.setProductCondition("new");
        product1.setProductStatus("Active");
        product1.setUnitInStock(11);
        product1.setProductManufacturer("Canon");

        Product product2 = new Product();

        product2.setProductId("2");
        product2.setProductName("Camera2");
        product2.setProductCategory("Device");
        product2.setProductDescription("This is Nikon non-pro camera");
        product2.setProductPrice(300);
        product2.setProductCondition("new");
        product2.setProductStatus("Active");
        product2.setUnitInStock(8);
        product2.setProductManufacturer("Nikon");

        productList = new ArrayList<Product>();
        productList.add(product1);
        productList.add(product2);

        return productList;
    }


    public Product getProductById(String productId) throws IOException {
        for (Product product : getProductList()) {
            if (product.getProductId().equals(productId)) {
                return product;
            }
        }

        throw new IOException("No product found.");
    }
}
