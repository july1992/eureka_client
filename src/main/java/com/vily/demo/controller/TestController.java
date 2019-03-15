package com.vily.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 *  * description : 
 *  * Author : Vily
 *  * Date : 2019-03-15
 *  
 **/

@RestController
public class TestController {

    @Autowired
    DiscoveryClient mDiscoveryClient;

    @GetMapping("/dc")
    public String test(){
        String services = "Services: " + mDiscoveryClient.getServices();
        System.out.println(services);
        return services;


    }
}
