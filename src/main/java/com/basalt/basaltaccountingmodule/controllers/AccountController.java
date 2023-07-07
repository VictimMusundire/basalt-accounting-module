package com.basalt.basaltaccountingmodule.controllers;

import com.basalt.basaltaccountingmodule.dtos.AccountDto;
import com.basalt.basaltaccountingmodule.services.AccountService;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author Victim Musundire
 */

@RestController
@RequestMapping("/accounts")
@Slf4j
public class AccountController {

    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    // Account creation REST API
    @PostMapping("/create")
    public ResponseEntity<AccountDto> createUser(@Valid @RequestBody AccountDto accountDto){
        log.info("This is the request ====> " + accountDto);
        AccountDto savedAccount = accountService.createAccount(accountDto);
        return new ResponseEntity<>(savedAccount, HttpStatus.CREATED);
    }

    // Get Account by accountNumber REST API
    // TODO: 7/7/2023 On scaling, to communicate. 
    @GetMapping("/{accountNumber}")
    public ResponseEntity<AccountDto> getAccountByNumber(@PathVariable("accountNumber") String accountNumber){
        AccountDto accountDto = accountService.getAccount(accountNumber);
        return new ResponseEntity<>(accountDto, HttpStatus.OK);
    }

}
