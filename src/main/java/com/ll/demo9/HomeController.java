package com.ll.demo9;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/main1")
    public String showMain1() {
        return "main1";
    }
}