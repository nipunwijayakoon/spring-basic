package com.dev.pos;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomerController {
    @RequestMapping("/")
    public String loadMainPage(){
        return "main";
    }

    @RequestMapping("/register")
    public String loadRegistrationForm(){
        return "new-customer-form";
    }

    @RequestMapping( "/submit")
    public String submit(){
        return "details";
    }
}
