package com.nhnacademy.springmvc.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class MainController {

    //todo#7 - onlyServlet String 주입
    public MainController(String onlyServlet) {
        this.onlyServlet = onlyServlet;
    }

    private final String onlyServlet;

    @GetMapping("/main.do")
    public String main(){
        //todo#8 - onlyServlet String 출력
        log.info("onlyServlet:{}",onlyServlet);
        return "main";
    }
}
