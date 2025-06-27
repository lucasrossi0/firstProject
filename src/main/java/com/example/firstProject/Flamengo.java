package com.example.firstProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Flamengo {

    @GetMapping("/{joao}")
    public String flamengo(@PathVariable String joao) {
        return "jogador caro " + joao;
    }
}
