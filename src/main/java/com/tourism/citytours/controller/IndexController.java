package com.tourism.citytours.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    
    @GetMapping("/home")
    public String showComingSoonPage() {
        return "templates_fr/_core/index"; 
    }
    @GetMapping("/reg")
    public String showComingSoonPage1() {
        return "templates_fr/_components/headers/header_3"; 
    }
    @GetMapping("/rege")
    public String showComingSoonPage2() {
        return "templates_fr/_components/footers/footer_4"; 
    }
}
