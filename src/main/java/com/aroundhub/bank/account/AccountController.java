package com.aroundhub.bank.account;

import com.aroundhub.bank.account.dto.AccountGetResponse;
import com.aroundhub.bank.account.dto.DetailAccount;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class AccountController {
  private final AccountService accountService;

  @GetMapping("/accounts") // TODO: header -> customer
  public ResponseEntity<List<AccountGetResponse>> getAccounts(@RequestParam long customerId){

    return ResponseEntity.ok(accountService.getAccounts(customerId));
    //return ResponseEntity.status(HttpStatus.OK).body(accountService.getAccounts(customerId));
  }
  @GetMapping("/account/{accountNumber}/detail")
  public ResponseEntity<DetailAccount> getAccountDetail(@PathVariable String accountNumber,
                                                        @RequestParam long customerId,
                                                        @RequestParam LocalDateTime viewYearMonth){
    return ResponseEntity.ok(accountService.getAccountDetail(accountNumber, viewYearMonth));
  }
}
