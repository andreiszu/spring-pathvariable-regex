package com.example.pathvariableregex.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class Controller {

    @GetMapping("{userId:1\\d+}")
    public String getUsersStartingWithOne() {
        return "userId starting with 1";
    }

    @GetMapping("{userId:2\\d+}")
    public String getUsersStartingWithTwo() {
        return "userId starting with 2";
    }
}
