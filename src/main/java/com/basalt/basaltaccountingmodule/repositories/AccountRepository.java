package com.basalt.basaltaccountingmodule.repositories;

import com.basalt.basaltaccountingmodule.models.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * @author Victim Musundire
 */
public interface AccountRepository extends JpaRepository<Account, String> {
    Optional<Account> findByNumber(String account);
}
