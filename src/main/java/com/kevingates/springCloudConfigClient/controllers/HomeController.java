package com.kevingates.springCloudConfigClient.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class HomeController {
    @Value("${user.name}")
    private String userName="dev";

    @Value("${user.role}")
    private String role;

    @RequestMapping("/")
    public Map<String,String> index() {
        Map<String,String> settings = new HashMap<>();
        settings.put("author",userName);
        settings.put("role",role);

        return settings;
    }

    @RequestMapping("/kevingates")
    public String kevingates() {
        return "spring cloud client,author:" + userName+",role:"+role;
    }
}