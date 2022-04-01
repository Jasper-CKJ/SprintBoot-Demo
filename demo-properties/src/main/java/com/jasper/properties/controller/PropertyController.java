package com.jasper.properties.controller;

import com.jasper.properties.property.ApplicationProperty;
import com.jasper.properties.property.DeveloperProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jasper
 * @date 2022-04-01 11:22
 */
@RestController
public class PropertyController {

    @Autowired
    private ApplicationProperty applicationProperty;
    @Autowired
    private DeveloperProperty developerProperty;

    @GetMapping("/property")
    public Map<String, String> index() {
        Map<String, String> map = new HashMap<>();
        map.put("applicationProperty", applicationProperty.toString());
        map.put("develeoperProperty", developerProperty.toString());
        return map;
    }
}
