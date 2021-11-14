package com.example.gofdesignpatternwithjava._02_structural_patterns._01_before.security;

public interface UserDetailsService {

    UserDetails loadUser(String username);

}
