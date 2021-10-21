package com.springBootTest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public String msg(String nome) {
        return String.format("Bem vindo ao teste, %s", nome);
    }
}
