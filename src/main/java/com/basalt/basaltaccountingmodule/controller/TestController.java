package com.basalt.basaltaccountingmodule.controller;

import com.basalt.basaltaccountingmodule.dto.AccountDto;
import com.basalt.basaltaccountingmodule.utils.enums.AccountType;
import com.basalt.basaltaccountingmodule.utils.enums.Currency;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.OffsetDateTime;
import java.util.UUID;

@RestController
@RequestMapping("/accounts")
public class TestController {
    @GetMapping("/{id}")
    public AccountDto get(@PathVariable("id") String id) {
        return getTestAccount(id);
    }

    private AccountDto getTestAccount(String id) {
        return AccountDto.builder()
                .id(UUID.randomUUID().toString())
                .dateCreated(OffsetDateTime.now())
                .lastUpdated(OffsetDateTime.now())
                .currency(Currency.ZWL)
                .number("100100100")
                .type(AccountType.CURRENT)
                .firstName("Victim")
                .lastName("Musundire")
                .build();
    }
}
