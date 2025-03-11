package com.aroundhub.bank.customer;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public class Customer {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  private String name;

  private String grade;

  private int age;

  private String email;

  private String organization;

  private LocalDateTime createdAt;

  private LocalDateTime updatedAt;
}
