package com.example.bankingAccount.service;

import com.example.bankingAccount.model.BaseAccount;
import com.example.bankingAccount.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {
    double balance;

    final AccountRepository accountRepository;

    @Autowired
    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public <T extends BaseAccount> BaseAccount openingAccount(T account) {
        return accountRepository.save(account);
    }

    @Override
    public <T extends BaseAccount> BaseAccount deposit(double amount, T account) {
        if (amount <= 0) {
            throw new RuntimeException("invalid");
        }
        balance = account.getBalance() + amount;
        account.setBalance(balance);
        return accountRepository.save(account);
    }

    @Override
    public <T extends BaseAccount> BaseAccount withdraw(double amount, T account) {
        if (amount <= 0) {
            throw new RuntimeException();
        }
        if (amount > account.getBalance()) {
            throw new RuntimeException(".insufficient fund");
        }
        balance = account.getBalance() - amount;
        account.setBalance(balance);
        return accountRepository.save(account);
    }
}
