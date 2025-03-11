package com.aroundhub.bank.employee;

import jakarta.persistence.Id;

public class Employee {

  @Id
  private long id;

  private String name;

  private long brancdId;
}
