package com.aroundhub.bank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BankApplication {

  /*	private final Logger LOGGER = LoggerFactory.getLogger(BankApplication.class);

  Week today = Week.MONDAY;*/

  public static void main(String[] args) {
    SpringApplication.run(BankApplication.class, args);
  }
}
