package com.example.gofdesignpatternwithjava._02_structural_patterns._02_after;

import com.example.gofdesignpatternwithjava._02_structural_patterns._02_after.security.UserDetails;

// Adapter class
public class AccountUserDetails implements UserDetails {

    private Account account;

    public AccountUserDetails(Account account) {
        this.account = account;
    }

    @Override
    public String getUsername() {
        return this.account.getName();
    }

    @Override
    public String getPassword() {
        return this.account.getPassword();
    }
}
