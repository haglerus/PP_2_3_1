package com.haglerus.springcrud.service;

import com.haglerus.springcrud.model.User;

import java.util.List;

public interface UserService {

    List<User> getAll();

    User getUser(Long id);

    void add(User user);

    void update(User user);

    void delete(Long id);
}
