package com.basalt.basaltaccountingmodule.services.Impl;

import com.basalt.basaltaccountingmodule.dtos.AccountDto;
import com.basalt.basaltaccountingmodule.exceptions.AccountAlreadyExistsException;
import com.basalt.basaltaccountingmodule.exceptions.AccountNotFoundException;
import com.basalt.basaltaccountingmodule.mappers.AutoAccountMapper;
import com.basalt.basaltaccountingmodule.models.Account;
import com.basalt.basaltaccountingmodule.repositories.AccountRepository;
import com.basalt.basaltaccountingmodule.services.AccountService;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @author Victim Musundire
 */

@Service
public class AccountServiceImpl implements AccountService {

    private final AccountRepository accountRepository;

    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public AccountDto createAccount(AccountDto accountDto) {
        Optional<Account> optionalAccount = accountRepository.findByNumber(accountDto.getNumber());

        if(optionalAccount.isPresent()){
            throw new AccountAlreadyExistsException("Account Already Exists");
        }

        Account account = AutoAccountMapper.MAPPER.mapToAccount(accountDto);

        Account savedAccount = accountRepository.save(account);

        return AutoAccountMapper.MAPPER.mapToAccountDto(savedAccount);

    }

    @Override
    public AccountDto getAccount(String accountNumber) {

        Account account = accountRepository.findByNumber(accountNumber).orElseThrow(
                () -> new AccountNotFoundException("Account not found")
        );

        return AutoAccountMapper.MAPPER.mapToAccountDto(account);
    }
}
