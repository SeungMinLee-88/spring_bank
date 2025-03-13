package com.aroundhub.bank.account;

import com.aroundhub.bank.account.dto.AccountGetResponse;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AccountService {
  private final AccountRepository accountRepository;

  public List<AccountGetResponse> getAccounts(long cutomerId){
    return accountRepository.findAccountByCustomerId(cutomerId).stream().map(account -> AccountGetResponse.builder()
              .number(account.getNumber())
              .balance(account.getBalance())
              .branchId(account.getBranchId())
              .build()).toList();
  }
}
