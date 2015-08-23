package com.millinch.ebean.demo.web;

import com.millinch.ebean.demo.domain.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * This guy is lazy,nothing left.
 *
 * @author John Zhang 2015/8/21
 */
@RestController
public class UserApi {

    @RequestMapping(value = "/user")
    public List<User> getUsers() {
        return User.find.findList();
    }

    @RequestMapping("/user/{id}")
    public User getUser(@PathVariable Long id){
        return User.find.byId(id);
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.POST)
    public void saveUser(User user){
        user.insert();
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE)
    public void deleteUser(@PathVariable Long id) {
        User.find.deleteById(id);
    }
}
