package com.example.bankingAccount.service;

import com.example.bankingAccount.model.Customer;
import com.example.bankingAccount.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {


    final CustomerRepository customerRepository;

    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public Customer update(Customer customer) {
        Customer updateCustomer = customerRepository.findById(customer.getId()).
                orElseThrow(() -> new RuntimeException("not found person with :" + customer.getId()));
        updateCustomer.setEmail(customer.getEmail());
        updateCustomer.setFirstName(customer.getFirstName());
        updateCustomer.setLatName(customer.getLatName());
        updateCustomer.setAddress(customer.getAddress());
        updateCustomer.setPhoneNumber(customer.getPhoneNumber());
        return customerRepository.save(updateCustomer);
    }

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Customer findById(Long id) {
        return customerRepository.findById(id).orElseThrow(() -> new RuntimeException("not found person with :" + id));
    }

    @Override
    public void delete(Long id) {
        customerRepository.deleteById(id);
    }
}
