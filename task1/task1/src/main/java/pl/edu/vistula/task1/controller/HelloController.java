package pl.edu.vistula.task1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping("/")
    @ResponseBody
    public String hello() {
        return "Hello World!";
    }

    @GetMapping("/greeting")
    public String greeting(Model model) {
        model.addAttribute("name", "Vistula");
        return "greeting";
    }
}