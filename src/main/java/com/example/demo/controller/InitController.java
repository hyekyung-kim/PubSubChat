package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class InitController {

    @Value("main")
    private String mainView;

    @RequestMapping(value="/main", method = RequestMethod.GET)
    public String form() {
        System.out.println("메인 페이지!");
        return mainView;
    }
}
