package com.aroundhub.bank.transaction;

import com.aroundhub.bank.account.Account;
import com.aroundhub.bank.account.AccountRepository;
import com.aroundhub.bank.transaction.dto.TransferPostRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class TransactionService {

  private final TransactionRepository transactionRepository;
  private final AccountRepository accountRepository;

  @Transactional
  public void transfer(TransferPostRequest request){

    /*Optional<Account> withdrawAccount = accountRepository.findAccountByNumber(request.getRequestAccountNumber());

    if(withdrawAccount.isEmpty()){
      throw new RuntimeException("not exists!!!!");
    }
    Account with = withdrawAccount.get();
*/
    System.out.println("request.getRequestAccountNumber() : " + request.getRequestAccountNumber());
    Account withdrawAccount = accountRepository.findAccountByNumber(request.getRequestAccountNumber())
            .orElseThrow();

    System.out.println("chk 1111111111");
    long amount = withdrawAccount.getBalance();

    Transaction withdraw = Transaction.builder()
            .balance(request.getRequestAmount())
            .type("withdraw")
            .balanceAfterTransaction(amount - request.getRequestAmount())
            .accountNumber(request.getRequestAccountNumber()).build();
    System.out.println("chk 22222222");

    System.out.println("withdraw : " + withdraw.getCreatedAt());
    System.out.println("withdraw : " + withdraw.getCreatedAt());
    transactionRepository.save(withdraw);
    System.out.println("chk 3333333333");

    /*Account depositAccount = accountRepository.findAccountByNumber(request.getTargetAccountNumber())
            .orElseThrow();

    amount = withdrawAccount.getBalance();

    Transaction deposit = Transaction.builder()
            .balance(request.getTargetAmount())
            .type("deposit")
            .balanceAfterTransaction(amount + request.getTargetAmount())
            .accountNumber(request.getTargetAccountNumber()).build();

    transactionRepository.save(deposit);*/
  }

}
