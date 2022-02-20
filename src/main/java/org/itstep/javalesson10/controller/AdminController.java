package org.itstep.javalesson10.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller

public class AdminController {

    @GetMapping("/admin")
    String admin(){
        return "admin";
    }
}
