package com.svlugovoy.estore.controller;

import com.svlugovoy.estore.dao.ProductDao;
import com.svlugovoy.estore.model.Product;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
import java.util.List;

/**
 * @author Sergey Lugovoy <svlugovoy@gmail.com> 01.05.2016.
 */

@Controller
public class HomeController {

    private static final Logger log = Logger.getLogger(HomeController.class);

    @Autowired
    private ProductDao productDao;

    @RequestMapping("/")
    public String home() {
        log.info("some message...");
        return "home";
    }

    @RequestMapping("/productList")
    public String getProducts(Model model) {
        List<Product> products = productDao.getAllProducts();
        model.addAttribute("products", products);

        return "productList";
    }

    @RequestMapping("/productList/viewProduct/{productId}")
    public String viewProduct(@PathVariable String productId, Model model) throws IOException {
        Product product = productDao.getProductById(productId);
        model.addAttribute(product);
        return "viewProduct";
    }
}
