package com.aroundhub.bank.account;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import com.aroundhub.bank.common.entity.BaseEntity;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
public class Account extends BaseEntity {
  @Id
  private String number;
  private String type;
  private boolean isFirst;
  private long balance;
  private String password;
  private int employeeId;
  private int branchId;
  private long customerId;
  private LocalDateTime createdAt;
  private LocalDateTime updatedAt;
}
