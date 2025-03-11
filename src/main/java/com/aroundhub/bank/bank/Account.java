package com.aroundhub.bank.bank;

import jakarta.persistence.Id;

import java.time.LocalDateTime;

public class Account {
  @Id
  private String number;

  private String type;

  private long balance;

  private String password;

  private int employeeId;

  private int branchId;

  private int customerId;

  private LocalDateTime createdAt;

  private LocalDateTime updatedAt;
}
