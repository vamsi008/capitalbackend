package com.amrvt.rest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AmaravatiController {

    @RequestMapping("/")
    public String home(){
        return "Hello World!";
    }

}
