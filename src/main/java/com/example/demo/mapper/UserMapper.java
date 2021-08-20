package com.example.demo.mapper;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface UserMapper {
    //    查
    @Select("select * from user where id = #{id}")
    public List<User> queryById(Map<String, Object> param);

    //    删
    @Delete("delete from user where id = #{id}")
    public int deleteById(Map<String, Object> param);

    //    增
    @Insert("insert into user values (#{id}, #{name}, #{age},#{adcd})")
    public int insert(User user);

    //    改
    @Update("update `user` set name =#{name},age=#{age},adcd=#{adcd} where user.id = #{id}")
    public int update(User user);

}
