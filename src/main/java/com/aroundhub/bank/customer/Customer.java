package com.aroundhub.bank.customer;

import jakarta.persistence.Id;

import java.time.LocalDateTime;

public class Customer {

  @Id
  private long id;

  private String name;

  private String grade;

  private int age;

  private String email;

  private String organization;

  private LocalDateTime createdAt;

  private LocalDateTime updatedAt;
}
