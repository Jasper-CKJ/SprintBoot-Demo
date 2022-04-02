package com.jasper.exceptionhandler.controller;

import com.jasper.exceptionhandler.constant.Status;
import com.jasper.exceptionhandler.exception.JsonException;
import com.jasper.exceptionhandler.exception.PageException;
import com.jasper.exceptionhandler.model.ApiResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author jasper
 * @date 2022-04-02 14:55
 */
@Controller
public class TestController {
    @GetMapping("/json")
    @ResponseBody
    public ApiResponse jsonException() {
        throw new JsonException(Status.UNKNOWN_ERROR);
    }

    @GetMapping("/page")
    public ModelAndView pageException() {
        throw new PageException(Status.UNKNOWN_ERROR);
    }
}
