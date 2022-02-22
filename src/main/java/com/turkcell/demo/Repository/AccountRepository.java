package com.turkcell.demo.Repository;

import com.turkcell.demo.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public class AccountRepository extends JpaRepository<Account, String> {
}
