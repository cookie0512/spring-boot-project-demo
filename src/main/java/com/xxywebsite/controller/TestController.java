package com.xxywebsite.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.Inet4Address;
import java.net.UnknownHostException;

@RequestMapping("/test")
@RestController
public class TestController {
    @GetMapping("/ip")
    public String getIp() throws UnknownHostException {
        String hostAddress = Inet4Address.getLocalHost().getHostAddress();
        return hostAddress;
    }
}