package com.svlugovoy.estore.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Sergey Lugovoy <svlugovoy@gmail.com> 01.05.2016.
 */

@Controller
public class HomeController {

    private static final Logger log = Logger.getLogger(HomeController.class);

    @RequestMapping("/")
    public String home(){
        log.info("some message...");
        return "home";
    }
}
