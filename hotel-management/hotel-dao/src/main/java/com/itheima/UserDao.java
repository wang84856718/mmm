package com.itheima;

import com.ithema.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserDao {

    @Select("select * from user")
    public List<User> findAll();

    @Insert("insert into user(name,username,password) values(#{name},#{username},#{password})")
    void save(User user);

    void deleteUser(String userId);

    void deleteUser_Role(String userId);
}
