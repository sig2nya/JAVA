package com.example.demospringsecurityform.account;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Integer> {
    Account findByUsername(String username); // 해당 AccountRepository가 이미 bean으로 등록된 것처럼 사용 가능.

}
