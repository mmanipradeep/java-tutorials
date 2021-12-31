package com.mani.service;

import com.mani.model.Users;
import com.mani.model.UserDto;

import java.util.List;
public interface UserService {

    Users save(UserDto user);
    List<Users> findAll();
    void delete(int id);

    Users findOne(String username);

    Users findById(int id);

    UserDto update(UserDto userDto);
}
