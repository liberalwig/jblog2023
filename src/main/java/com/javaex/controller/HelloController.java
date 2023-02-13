package com.javaex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("/testPage")
    public String main(Model model) {
        String str = "test";
        model.addAttribute("str", str);

        System.out.println("Hello Controller > main()");

        return "main/index";
    }

}