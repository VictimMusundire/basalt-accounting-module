package com.basalt.basaltaccountingmodule.dtos;

import com.basalt.basaltaccountingmodule.enums.AccountType;
import com.basalt.basaltaccountingmodule.enums.Currency;
import lombok.*;
import lombok.experimental.SuperBuilder;
/**
 * @author Victim Musundire
 */
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
