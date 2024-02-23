package com.dylan.springSecurityDemo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoansController {

    @GetMapping("/MyLoans")
    public String loans() {
        return "Loans";
    }
}
