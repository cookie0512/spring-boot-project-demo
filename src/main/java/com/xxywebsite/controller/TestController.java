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

    @GetMapping("/hello")
    public String hello() {
        return "Hello From Cookie~";
    }

    @GetMapping("/hello2")
    public String hello2() {
        return "Hello2";
    }

    @GetMapping("/hello3")
    public String hello3() {
        return "hello3";
    }

    @GetMapping("/hello4")
    public String hello4() {
        return "hello4";
    }

    @GetMapping("/hello5")
    public String hello5() {
        return "hello5";
    }

    @GetMapping("/hello6")
    public String hello6() {
        return "hello6";
    }

    @GetMapping("/hello7")
    public String hello7() {
        return "hello7";
    }

    @GetMapping("/hello8")
    public String hello8() {
        return "hello8";
    }

    @GetMapping("/hello9")
    public String hello9() {
        return "hello9";
    }

    @GetMapping("/hello10")
    public String hello10() {
        return "hello10";
    }
}

