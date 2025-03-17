package com.aroundhub.bank.transaction.dto;


import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class TransferPostRequest {
  private String requestAccountNumber;
  private String requestType;
  private int requestAmount;
  private String accountToken;
  private String targetAccountNumber;
  private int targetAmount;

}
