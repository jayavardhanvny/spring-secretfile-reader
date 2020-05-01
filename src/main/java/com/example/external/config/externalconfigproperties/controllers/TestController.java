package com.example.external.config.externalconfigproperties.controllers;

import com.example.external.config.externalconfigproperties.configuration.PropertyAccessorConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class TestController {
    @Autowired
    PropertyAccessorConfig propertyAccessorConfig;
    @GetMapping(value = "/test")
    public ResponseEntity<?> test(){
        log.info("Trdstyingg: {}", propertyAccessorConfig.getUsername());
        return ResponseEntity.ok().build();
    }
}
