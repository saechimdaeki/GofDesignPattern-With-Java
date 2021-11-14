package com.example.gofdesignpatternwithjava._02_structural_patterns._02_after.security;

public interface UserDetailsService {

    UserDetails loadUser(String username);

}
