package com.example.demo.service;

import com.example.demo.domain.CustomUserDetails;
import com.example.demo.domain.User;
import com.example.demo.repository.UserRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepositoryImpl userRepository;


    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Optional<User> optionalUsers = userRepository.getUserByEmail(email);
        return optionalUsers.map(CustomUserDetails::new).get(); // java 8


        // old java version
        /*User user = optionalUsers.get();
        CustomUserDetails customUserDetails = new CustomUserDetails(user);
        return customUserDetails;*/
    }
}
