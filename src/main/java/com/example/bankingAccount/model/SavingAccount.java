package com.example.bankingAccount.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "SAVING_ACCOUNT")
public class SavingAccount extends BaseAccount {
}
