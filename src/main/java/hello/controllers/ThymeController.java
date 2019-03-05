package hello.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ThymeController {
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("name", "Juan Carlos");
        return "index";
    }
}
