package com.aroundhub.bank.account.dto;

import com.aroundhub.bank.transaction.Transaction;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.util.List;
/*
accountNumber
accountType
accountName
accountAmount
 */
@Builder
@Getter
@ToString
public class DetailAccount {
  private String accountNumber;
  private String accountType;
  private String accountName;
  private long accountAmount;

  private List<Transaction> depositAndWithdrawalHistoiry;
}
