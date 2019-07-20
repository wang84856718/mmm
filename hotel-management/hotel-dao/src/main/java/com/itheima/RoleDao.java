package com.itheima;

import com.ithema.Role;
import org.apache.ibatis.annotations.Insert;

public interface RoleDao {


    @Insert("insert into role(rolename,roledesc) values(#{rolename},#{roledesc})")
    void save(Role role);
}
