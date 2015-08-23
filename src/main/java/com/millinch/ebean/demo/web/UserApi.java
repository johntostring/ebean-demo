package com.millinch.ebean.demo.web;

import com.millinch.ebean.demo.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * This guy is lazy,nothing left.
 *
 * @author John Zhang 2015/8/21
 */
@Controller
public class UserApi {

    @RequestMapping("/user")
    List<User> getUsers() {
        return User.find.all();
    }

    @ResponseBody
    @RequestMapping("/")
    String home(){
        return "Hello World";
    }
}
