package com.wide.widebackend.service;

import com.wide.widebackend.Entity.User;
import com.wide.widebackend.repository.UserRepository;
import org.apache.logging.log4j.util.Supplier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Service
public class UserService implements UserDetailsService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }

    //save user
    public void saveUser(User user){

        if (user != null){
            userRepository.save(user);
        }else {
            throw new NullPointerException("user provided is null");
        }
    }

    //find user by id
    public User findUserById(Long id){
            return userRepository.findById(id).orElseThrow(
                    ()->new RuntimeException("error occured while trying to find user by id"));
    }


}
