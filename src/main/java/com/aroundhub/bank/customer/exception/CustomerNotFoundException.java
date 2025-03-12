package com.aroundhub.bank.customer.exception;

import com.aroundhub.bank.common.exception.BaseException;
import lombok.Getter;
import lombok.RequiredArgsConstructor;


public class CustomerNotFoundException extends CustomerException {
  public CustomerNotFoundException(long id, String name){
    super(id, name);
  }
}
