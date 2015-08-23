package com.millinch.ebean.demo;

import com.millinch.ebean.demo.domain.Role;
import com.millinch.ebean.demo.domain.User;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * This guy is lazy, nothing left.
 *
 * @author 张劲航
 */
public class RoleTest extends Enhancer {

    private static final Logger LOGGER = LoggerFactory.getLogger(RoleTest.class);

    @Test
    public void testSelect(){
        List<Role> list = Role.find
                              .select("name")
                              .fetch("createBy", "nickname")
                              .where().eq("createBy.id", 1L)
                              .findList();
        for (Role role : list) {
            System.out.println("role = " + role);
        }
    }

    @Test
    public void testInsert(){
        User user = new User();
        user.setMobilePhone("123456");
        user.setNickname("张三");
        user.setPassword("abcde");
        user.save();
        Role role = new Role();
        role.setName("超级管理员");
        role.setRole("superRole");
        role.setCreateBy(user);
        role.save();
    }

    @Test
    public void testSelectThenUpdate(){
        User user = User.find.where().eq("mobilePhone", "123456").findUnique();

    }
}
