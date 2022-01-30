package com.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WebControll {

    @RequestMapping("/")
    public List<String> home(){
        return List.of("Allan", "Collado","Raudez");
    }
}
