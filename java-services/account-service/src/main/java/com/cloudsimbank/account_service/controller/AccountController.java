package com.cloudsimbank.account_service.controller;

import com.cloudsimbank.account_service.model.Account;
import com.cloudsimbank.account_service.service.AccountService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    private final AccountService service;

    public AccountController(AccountService service) {
        this.service = service;
    }

    @GetMapping
    public List<Account> getAccounts() {
        return service.getAccounts();
    }

    @GetMapping("/{id}")
    public Account getAccount(@PathVariable Long id) {
        return service.getAccountById(id);
    }
}
