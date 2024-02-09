package com.example.bankingAccount.service;

import com.example.bankingAccount.model.Customer;

import java.util.List;

public interface CustomerService {
    Customer save(Customer customer);

    Customer update(Customer customer);

    List<Customer> findAll();

    Customer findById(Long id);

    void delete(Long id);

}
