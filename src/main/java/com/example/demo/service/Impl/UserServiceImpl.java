package com.example.demo.service.Impl;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> queryById(Map<String, Object> param) {
        return userMapper.queryById(param);
    }

    @Override
    public Map<String, Object> deleteById(Map<String, Object> param) {
        HashMap<String, Object> res = new HashMap<>();
        int i = userMapper.deleteById(param);
        if(i>0){
            res.put("data","删除成功");
        }else{
            res.put("data","删除失败");
        }
        return res;
    }

    @Override
    public Map<String, Object> insert(User user) {
        HashMap<String, Object> res = new HashMap<>();
        int i = userMapper.insert(user);
        if(i>0){
            res.put("data","新增成功");
        }else{
            res.put("data","新增失败");
        }
        return res;
    }

    @Override
    public HashMap<String, Object> update(User user) {
        HashMap<String, Object> res = new HashMap<>();
        int i = userMapper.update(user);
        if(i>0){
            res.put("data","更新成功");
        }else{
            res.put("data","更新失败");
        }
        return res;
    }
}
