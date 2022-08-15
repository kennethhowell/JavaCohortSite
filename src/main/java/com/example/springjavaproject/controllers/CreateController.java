package com.example.springjavaproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class CreateController {

    @GetMapping("/create/{entity}")
    public String createView(Model model, @PathVariable String entity){

        model.addAttribute("createViewTitle", "Create " + entity);
        model.addAttribute("entity", entity);
        return "create";
    }

}
