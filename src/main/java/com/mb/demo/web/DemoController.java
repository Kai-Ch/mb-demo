package com.mb.demo.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @GetMapping("/{msg}")
    public String demo(@PathVariable String msg) {
        return "Hello " + msg;
    }
}
