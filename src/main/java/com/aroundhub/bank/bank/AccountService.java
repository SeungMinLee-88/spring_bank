package com.aroundhub.bank.bank;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AccountService {

  private final AccountRepository accountRepository;

  void test(){
    accountRepository.findById("sd");
  }
}
