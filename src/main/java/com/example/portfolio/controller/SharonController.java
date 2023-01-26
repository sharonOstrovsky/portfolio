package com.example.portfolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SharonController {

    @GetMapping("/cv")
    public String resume(){
        return "resume.html";
    }

    @GetMapping("/index")
    public String presentacion(){
        return "presentacion.html";
    }


}
