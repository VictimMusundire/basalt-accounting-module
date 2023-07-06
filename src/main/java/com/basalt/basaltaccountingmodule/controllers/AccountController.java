package com.basalt.basaltaccountingmodule.controllers;

import com.basalt.basaltaccountingmodule.dtos.AccountDto;
import com.basalt.basaltaccountingmodule.services.AccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    // Create Account REST API
    @PostMapping("/create")
    public ResponseEntity<AccountDto> createUser(@RequestBody AccountDto accountDto){
        log.info("This is the request ====> " + accountDto);
        AccountDto savedAccount = accountService.createAccount(accountDto);
        return new ResponseEntity<>(savedAccount, HttpStatus.CREATED);
    }

}
