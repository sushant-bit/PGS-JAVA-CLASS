package com.pgs.journalApplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {

    @GetMapping("/healthcheck")
    public String checkHealth(){
        return  "Hello Dipsan How aRE YOUUU?";
    }

}
