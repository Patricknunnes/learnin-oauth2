package br.com.oauth2.learning.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String hello(){
        return "Running Application";
    }

    @GetMapping("/notsecured")
    public String notsecured(){
        return "not secured";
    }
}
