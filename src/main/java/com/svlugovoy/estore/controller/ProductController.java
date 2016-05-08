package com.svlugovoy.estore.controller;

import com.svlugovoy.estore.model.Product;
import com.svlugovoy.estore.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author Sergey Lugovoy <svlugovoy@gmail.com> 08.05.2016.
 */

@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping("/productList")
    public String getProducts(Model model) {

        List<Product> products = productService.getProductList();
        model.addAttribute("products", products);

        return "productList";
    }


}
