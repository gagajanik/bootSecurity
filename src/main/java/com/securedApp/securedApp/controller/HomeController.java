package com.securedApp.securedApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.security.Principal;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String home() {
        return "home";
    }

    @RequestMapping("/login")
    public String login() {
        return "login";
    }
    @RequestMapping("/logout-success")
    public String logout() {
        return "login";
    }

    @RequestMapping("/secured/all")
    public @ResponseBody
    Principal securedUser(Principal user){
        return user;
    }
}
