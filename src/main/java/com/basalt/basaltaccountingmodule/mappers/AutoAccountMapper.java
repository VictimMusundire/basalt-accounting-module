package com.basalt.basaltaccountingmodule.mappers;

import com.basalt.basaltaccountingmodule.dtos.AccountDto;
import com.basalt.basaltaccountingmodule.models.Account;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author Victim Musundire
 */

@Mapper
public interface AutoAccountMapper {

    AutoAccountMapper MAPPER = Mappers.getMapper(AutoAccountMapper.class);

    AccountDto mapToAccountDto(Account account);

    Account mapToAccount(AccountDto accountDto);
}
