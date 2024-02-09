package com.example.bankingAccount.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "CURRENT_ACCOUNT")
public class CurrentAccount extends BaseAccount {
}
