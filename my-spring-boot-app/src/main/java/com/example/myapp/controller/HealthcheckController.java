package com.example.myapp.controller;

import com.example.myapp.mapper.HealthcheckMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthcheckController {

    @Autowired
    private HealthcheckMapper healthcheckMapper;

    @GetMapping("/healthcheck")
    public String getHealthcheck() {
        return healthcheckMapper.getHealthcheckStatus();
    }
}
