package com.aroundhub.bank.transaction;

import jakarta.persistence.Id;

public class Transaction {

  @Id
  private long id;

  private long balance;

  private String type;

  private long balanceAfterTransaction;

  private String accountNumber;
}
