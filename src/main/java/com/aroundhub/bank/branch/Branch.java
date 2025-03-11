package com.aroundhub.bank.branch;

import jakarta.persistence.Id;

import java.time.LocalDateTime;

public class Branch {

  @Id
  private long id;

  private String name;

  private String address;
}
