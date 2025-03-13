package com.aroundhub.bank.customer.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import com.aroundhub.bank.common.exception.BaseException;

@Getter
@RequiredArgsConstructor
public class CustomerException extends BaseException {
  private final long id;
  private final String name;
}
