package com.jasper.helloworld.controller;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jasper
 * @date 2022-03-31 17:18
 */
@RestController
public class HelloWorldController {
    /**
     * Hello，World
     *
     * @param who 参数，非必须
     * @return Hello, ${who}
     */
    @GetMapping("/hello")
    public String sayHello(@RequestParam(required = false, name = "who") String who) {
        if (StringUtils.isEmpty(who)) {
            who = "World";
        }
        return String.format("Hello, %s!", who);
    }
}
