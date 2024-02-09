package com.example.bankingAccount.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@MappedSuperclass
@Setter
@Getter
public class BaseAccount {
    @Id
    @GeneratedValue
    private Long id;

    @Column(unique = true, nullable = false)
    private Long accountNumber;

    @Column(unique = true, nullable = false)
    private Long cardNumber;

    @Column(unique = true, nullable = false)
    private double balance;

    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;
}
