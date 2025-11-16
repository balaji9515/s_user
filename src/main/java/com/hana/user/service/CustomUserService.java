package com.hana.user.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.hana.user.entity.User;
import com.hana.user.repository.UserRepository;

@Service
public class CustomUserService implements UserDetailsService {

    @Autowired
    private UserRepository userRepo;

    @Override
    public User loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> user = userRepo.getUserByUsername(username);
        if (user.isEmpty()){
            throw new UsernameNotFoundException("User not Found");
        }
        
        return user;
       
    }

    public UserRepository saveUser(User user){
        return userRepo.save(user);
    }

}
