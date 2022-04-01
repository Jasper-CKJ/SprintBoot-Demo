package com.jasper.demologaop.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author jasper
 * @date 2022-04-01 18:33
 */
@RestController
public class TestController {
    @GetMapping("/log")
    public String test(String who) {
        return "a log";
    }
}
