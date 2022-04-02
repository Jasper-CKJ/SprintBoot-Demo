package com.jasper.handlerinterceptor.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jasper
 * @date 2022-04-02 17:19
 */
@Slf4j
@RestController
public class UserController {
    @GetMapping("/test")
    public String test() {
        log.info("test");
        return "success";
    }

    @GetMapping("/user")
    public void currentUser() {
        log.info("[currentUser]");
    }
}
