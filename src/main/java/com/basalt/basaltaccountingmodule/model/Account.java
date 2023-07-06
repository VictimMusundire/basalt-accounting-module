package com.basalt.basaltaccountingmodule.model;

import com.basalt.basaltaccountingmodule.utils.enums.AccountType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Inheritance;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import com.basalt.basaltaccountingmodule.utils.enums.Currency;

@Data
@Entity
@Inheritance
@NoArgsConstructor
@AllArgsConstructor
@ToString(of = {
        "firstName",
        "lastName",
        "number",
        "type",
        "currency"
})
public class Account extends BaseEntity {
    private String firstName;
    private String lastName;
    private String number;

    @Enumerated(EnumType.STRING)
    private AccountType type;

    @Enumerated(EnumType.STRING)
    private Currency currency;
}
