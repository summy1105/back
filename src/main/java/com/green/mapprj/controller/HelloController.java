package com.green.mapprj.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public void main(){
        System.out.println("진성이 바보~,~");
    }
}
