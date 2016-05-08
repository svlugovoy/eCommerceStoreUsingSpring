package com.svlugovoy.estore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Sergey Lugovoy <svlugovoy@gmail.com> 08.05.2016.
 */

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home() {

        return "home";
    }

}
