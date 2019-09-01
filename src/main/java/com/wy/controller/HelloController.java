package com.wy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController

public class HelloController {


    @RequestMapping("/hello")
    public String hello() {
        return "Hello Spring Boot!";
    }
    @RequestMapping(value = "/say2/{id}",method = RequestMethod.GET)
    public  String say2(@PathVariable("id") Integer id){
        return "id:" + id;
        //   return  girlProperties.getCupSize();
    }
}
