package com.example.bankingAccount.controller;

import com.example.bankingAccount.model.BaseAccount;
import com.example.bankingAccount.model.CurrentAccount;
import com.example.bankingAccount.model.SavingAccount;
import com.example.bankingAccount.model.ShortTermAccount;
import com.example.bankingAccount.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/account")
@RestController
public class AccountController {

    final AccountService accountService;

    @Autowired
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    //    CurrentAccount Endpoints
    @PostMapping("/opening_account/current_account")
    public ResponseEntity<BaseAccount> openingAccount(@RequestBody CurrentAccount currentAccount) {
        return ResponseEntity.ok(accountService.openingAccount(currentAccount));
    }

    @PostMapping("/deposit/current_account")
    public ResponseEntity<BaseAccount> deposit(@RequestBody CurrentAccount currentAccount, @RequestParam("amount") double amount) {
        return ResponseEntity.ok(accountService.deposit(amount, currentAccount));
    }

    @PostMapping("/withdraw/current_account")
    public ResponseEntity<BaseAccount> withdraw(@RequestBody CurrentAccount currentAccount, @RequestParam("amount") double amount) {
        return ResponseEntity.ok(accountService.withdraw(amount, currentAccount));
    }

    //    SavingAccount Endpoints
    @PostMapping("/opening_account/savingAccount")
    public ResponseEntity<BaseAccount> openingAccount(@RequestBody SavingAccount savingAccount) {
        return ResponseEntity.ok(accountService.openingAccount(savingAccount));
    }

    @PostMapping("/deposit/savingAccount")
    public ResponseEntity<BaseAccount> deposit(@RequestBody SavingAccount savingAccount, @RequestParam("amount") double amount) {
        return ResponseEntity.ok(accountService.deposit(amount, savingAccount));
    }

    @PostMapping("/withdraw/savingAccount")
    public ResponseEntity<BaseAccount> withdraw(@RequestBody SavingAccount savingAccount, @RequestParam("amount") double amount) {
        return ResponseEntity.ok(accountService.withdraw(amount, savingAccount));
    }

    //    ShortTermAccount Endpoints
    @PostMapping("/opening_account/shortTermAccount")
    public ResponseEntity<BaseAccount> openingAccount(@RequestBody ShortTermAccount shortTermAccount) {
        return ResponseEntity.ok(accountService.openingAccount(shortTermAccount));
    }

    @PostMapping("/deposit/shortTermAccount")
    public ResponseEntity<BaseAccount> deposit(@RequestBody ShortTermAccount shortTermAccount, @RequestParam("amount") double amount) {
        return ResponseEntity.ok(accountService.deposit(amount, shortTermAccount));
    }

    @PostMapping("/withdraw/shortTermAccount")
    public ResponseEntity<BaseAccount> withdraw(@RequestBody ShortTermAccount shortTermAccount, @RequestParam("amount") double amount) {
        return ResponseEntity.ok(accountService.withdraw(amount, shortTermAccount));
    }
}
