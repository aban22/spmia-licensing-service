package com.thoughtmechanix.licenses.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thoughtmechanix.licenses.services.DiscoveryService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping(value="v1/tools")
public class ToolsController {

	private final DiscoveryService discoveryService;

    @GetMapping("/eureka/services")
    public List<String> getEurekaServices() {
        return discoveryService.getEurekaServices();
    }
    
}