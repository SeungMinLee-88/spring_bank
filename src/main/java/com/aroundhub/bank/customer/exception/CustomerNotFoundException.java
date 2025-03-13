package com.aroundhub.bank.customer.exception;

public class CustomerNotFoundException extends CustomerException {
  public CustomerNotFoundException(long id, String name) {
    super(id, name);
  }
}
