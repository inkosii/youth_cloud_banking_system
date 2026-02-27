package com.cloudsimbank.account_service.repository;

import com.cloudsimbank.account_service.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
