package com.aroundhub.bank.transaction;

import com.aroundhub.bank.transaction.dto.TransferPostRequest;
import com.aroundhub.bank.transaction.dto.TransferPostResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/")
public class TransactionController {

  private final TransactionService transactionService;

  @PostMapping("/transfer")
  public ResponseEntity<TransferPostResponse> transfer(@RequestBody TransferPostRequest request){

    System.out.println("call transfer");
    transactionService.transfer(request);
    return ResponseEntity.ok(TransferPostResponse
            .builder()
            .resultMessage("complete")
            .resultCode("200")
            .build());
  }

}
