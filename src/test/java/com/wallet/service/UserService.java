package com.wallet.service;

import com.entity.User;

import java.util.Optional;

public interface UserService {

    User save(User u);

    Optional<User> findByEmail(String email);

}
