package com.aroundhub.bank.customer.exception;

import com.aroundhub.bank.common.exception.BaseException;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class CustomerException extends BaseException {
  private final long id;
  private final String name;
}
