package com.example.bankingAccount.service;

import com.example.bankingAccount.model.BaseAccount;

public interface AccountService {

    <T extends BaseAccount> BaseAccount openingAccount(T account);
    <T extends BaseAccount> BaseAccount deposit(double amount, T account);

    <T extends BaseAccount> BaseAccount withdraw(double amount, T account);
}
