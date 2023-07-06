package com.basalt.basaltaccountingmodule.dto;

import com.basalt.basaltaccountingmodule.utils.enums.AccountType;
import com.basalt.basaltaccountingmodule.utils.enums.Currency;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class AccountDto extends BaseDto {
    private String firstName;
    private String lastName;
    private String number;
    private AccountType type;
    private Currency currency;
}
