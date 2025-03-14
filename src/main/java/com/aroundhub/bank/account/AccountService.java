package com.aroundhub.bank.account;

import com.aroundhub.bank.account.dto.AccountGetResponse;
import com.aroundhub.bank.account.dto.DetailAccount;
import com.aroundhub.bank.transaction.Transaction;
import com.aroundhub.bank.transaction.TransactionRepository;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AccountService {
  private final AccountRepository accountRepository;
  private final TransactionRepository transactionRepository;

  public List<AccountGetResponse> getAccounts(long cutomerId){
    return accountRepository.findAccountByCustomerId(cutomerId).stream().map(account -> AccountGetResponse.builder()
              .number(account.getNumber())
              .balance(account.getBalance())
              .branchId(account.getBranchId())
              .build()).toList();
  }

  public DetailAccount getAccountDetail(String accountNumber, LocalDateTime viewYearMonth){
    Account account = accountRepository.findAccountByNumber(accountNumber).orElseThrow();
    LocalDateTime startDate = viewYearMonth.plusDays(1);
    LocalDateTime endDate = viewYearMonth.plusMonths(1);
    List<Transaction> transactionList = transactionRepository.findByAccountNumberAndCreatedAtBetween(accountNumber, startDate, endDate);

    return DetailAccount.builder()
            .accountNumber(account.getNumber())
            .accountAmount(account.getBalance())
            .accountType(account.getType())
            .depositAndWithdrawalHistoiry(transactionList)
            .build();
  }
}
