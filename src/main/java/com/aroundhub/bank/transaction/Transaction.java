package com.aroundhub.bank.transaction;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Transaction {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  private long balance;

  private String type;

  private long balanceAfterTransaction;

  private String accountNumber;
}
