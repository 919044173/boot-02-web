package com.atguigu.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ay.
 * @create 2022-12-28 17:04
 */
@RestController
public class HelloController {

    @RequestMapping("/kon.jpg")
    public String Hello(){
        return "kon.jpg";
    }

    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public String getUser(){
        return "GetUser";
    }

    @RequestMapping(value = "/user",method = RequestMethod.POST)
    public String postUser(){
        return "PostUser";
    }

    @RequestMapping(value = "/user",method = RequestMethod.DELETE)
    public String deleteUser(){
        return "DeleteUser";
    }

    @RequestMapping(value = "/user",method =RequestMethod.PUT)
    public String PutUser(){
        return "putUser";
    }

}
