package com.example.demo.service;

import com.example.demo.entity.User;

import java.util.List;
import java.util.Map;

public interface IUserService {

    public List<User> queryById(Map<String, Object> param);

    public Map<String,Object> deleteById(Map<String, Object> param);

    public Map<String,Object> insert(User user);

    public Map<String,Object> update(User user);

}
