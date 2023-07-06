package com.basalt.basaltaccountingmodule.services;

import com.basalt.basaltaccountingmodule.dtos.AccountDto;

/**
 * @author Victim Musundire
 */
public interface AccountService {
    AccountDto createAccount(AccountDto accountDto);
    AccountDto getAccount(String accountNumber);
}
