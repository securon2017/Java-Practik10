package org.itstep.javalesson10.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;
import java.util.Random;

@Controller
public class HomeController {

    @GetMapping
    String index() {

        return "index";
    }

    @GetMapping("/about")
    String about()
    {
        return "about";
    }
}
