package com.ithema.service;

import com.ithema.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface UserService {


    List<User> findAll();

    void save(User user);

    void deleteUser(String userId);
}
