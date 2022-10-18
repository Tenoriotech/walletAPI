package com.wallet.service.impl;


import com.entity.User;
import com.repository.UserRepository;
import com.wallet.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository repository;

    @Override
    public User save(User u) {
        // TODO Auto=generated method stub
        return repository.save(u);
    }
    @Override
    public Optional<User> findByEmail(String email) {
        // TODO Auto=generated method stub
        return repository.findByEmailEquals(email);
    }
}
