package com.eureka.account.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("account")
public class AccountController {

    @GetMapping("account-detail/{accountId}")
    public String getAccountDetail(@PathVariable int accountId) {
        return "This Account Detail";
    }

}
