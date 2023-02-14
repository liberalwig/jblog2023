package com.javaex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("")
    public String main(Model model) {
        System.out.println("Hello Controller > main()");

        String str = "test";
        model.addAttribute("str", str);

        return "main/index";
    }

}