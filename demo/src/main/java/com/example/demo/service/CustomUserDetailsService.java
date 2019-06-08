package com.example.demo.service;

import com.example.demo.domain.CustomUserDetails;
import com.example.demo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.Optional;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserService userService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> optionalUsers = userService.getUserByEmail(username);
        if (optionalUsers.isPresent()) {
            return optionalUsers.map(CustomUserDetails::new).get(); // java 8
        }else{
            return null;
        }

        // old java version
        /*User user = optionalUsers.get();
        CustomUserDetails customUserDetails = new CustomUserDetails(user);
        return customUserDetails;*/
    }
}
