package com.authen.jwt.authentication.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.authen.jwt.authentication.repository.UserRepo;

@Service
public class UserDetailsServicelmpl implements UserDetailsService {

    private UserRepo userRepo;

    public UserDetailsServicelmpl(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRepo.findByUsername(username)
                    .orElseThrow(() -> new UsernameNotFoundException("Not found user name"));

    }

    
    
}
