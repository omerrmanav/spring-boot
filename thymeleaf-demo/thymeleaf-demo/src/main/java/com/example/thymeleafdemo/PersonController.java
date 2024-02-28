package com.example.thymeleafdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;

@Controller
public class PersonController {
    @GetMapping("/people")
    public String getAll(Model model) {
        model.addAttribute("people" , Arrays.asList(
                new Person("Elon", 52, 'm'),
                new Person("Warren", 93, 'm'),
                new Person("Steve", 56, 'm')
        ));
        return "people";
    }
}
