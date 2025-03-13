package com.aroundhub.bank.account;

import com.aroundhub.bank.account.dto.AccountGetResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class AccountController {
  private final AccountService accountService;

  @GetMapping("/accounts") // TODO: header -> customer
  public List<AccountGetResponse> getAccounts(@RequestParam long id){

    return accountService.getAccounts(id);
  }
}
