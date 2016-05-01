package com.svlugovoy.estore.controller;

import com.svlugovoy.estore.dao.ProductDao;
import com.svlugovoy.estore.model.Product;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author Sergey Lugovoy <svlugovoy@gmail.com> 01.05.2016.
 */

@Controller
public class HomeController {

    private static final Logger log = Logger.getLogger(HomeController.class);

    private ProductDao productDao = new ProductDao();

    @RequestMapping("/")
    public String home() {
        log.info("some message...");
        return "home";
    }

    @RequestMapping("/productList")
    public String getProducts(Model model) {
        List<Product> productList = productDao.getProductList();
        Product product = productList.get(0);
        model.addAttribute(product);

        return "productList";
    }
}
