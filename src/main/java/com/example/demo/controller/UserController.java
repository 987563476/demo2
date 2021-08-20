package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.Impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/test")
public class UserController {
    @Autowired
     public UserServiceImpl userServiceImpl;

    @RequestMapping(value = "/queryById")
    @ResponseBody
    public List<User> queryById(@RequestBody Map<String,Object> param){
        return userServiceImpl.queryById(param);
    }

    @RequestMapping(value = "/deleteById")
    @ResponseBody
    public Map<String,Object> deleteById(@RequestBody Map<String,Object> param){
        return userServiceImpl.deleteById(param);
    }

    @RequestMapping(value = "/insert")
    @ResponseBody
    public Map<String,Object> insert(@RequestBody User user){
        return userServiceImpl.insert(user);
    }

    @RequestMapping(value = "/update")
    @ResponseBody
    public Map<String,Object> update(@RequestBody User user){
        return userServiceImpl.update(user);
    }
}
