package com.example.camjontest.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/yaaas")
@CrossOrigin
public class DogController {

@GetMapping
    public String showCamModel(){
    return "camSide.html";
    }

}
