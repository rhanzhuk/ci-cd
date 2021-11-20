package com.team.cicd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CheckController {
    @GetMapping(path = "/status")
    public String checkInfo(){
        return "UP";
    }

    @GetMapping(path = "/status/code")
    public String statuscode(){
        return "200";
    }
}
