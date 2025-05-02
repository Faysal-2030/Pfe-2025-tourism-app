package com.tourism.citytours.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.Map;

@Controller
public class FooterController {

    @GetMapping("/footer2")
    public String afficherFooter2(Model model) {
        model.addAttribute("currentYear", java.time.Year.now().getValue());
        model.addAttribute("companyName", "City Tours");

        return "_components/footers/footer_2";
    }
}