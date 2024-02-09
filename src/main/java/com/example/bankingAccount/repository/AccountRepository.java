package com.example.bankingAccount.repository;

import com.example.bankingAccount.model.BaseAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<BaseAccount, Long> {
}
