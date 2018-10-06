package com.iq.HelloJenkins.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculator {

    @RequestMapping("/add")
    public int add( @RequestParam(value="par1") String par1, @RequestParam(value="par2") String par2){

        return Integer.parseInt(par1) + Integer.parseInt(par2);
    }

    @RequestMapping("/hello")
    public String hello(){
        return "Welcome to Jenkins";
    }
}
