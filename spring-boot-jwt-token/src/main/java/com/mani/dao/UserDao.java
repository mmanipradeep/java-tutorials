package com.mani.dao;

import com.mani.model.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends CrudRepository<Users, Integer> {

    Users findByUsername(String username);
}
