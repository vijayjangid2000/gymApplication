package com.vijay.gymapplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {



    @GetMapping("/check")
    public String getCustomers(){
        return "Server is working fine";
    }



}
