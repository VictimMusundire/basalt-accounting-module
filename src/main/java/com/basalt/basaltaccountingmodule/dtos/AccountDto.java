package com.basalt.basaltaccountingmodule.dtos;

import com.basalt.basaltaccountingmodule.enums.AccountType;
import com.basalt.basaltaccountingmodule.enums.Currency;
import jakarta.validation.constraints.NotEmpty;
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
    @NotEmpty(message = "Firstname should not be null or empty")
    private String firstName;
    @NotEmpty(message = "Lastname should not be null or empty")
    private String lastName;
    @NotEmpty(message = "Account number should not be null or empty")
    private String number;
    private AccountType type;
    private Currency currency;
}
