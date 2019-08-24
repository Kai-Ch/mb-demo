package com.mb.demo.web;

import com.mb.demo.service.IDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @Autowired
    private IDemoService iDemoService;

    @GetMapping("/{msg}")
    public String demo(@PathVariable String msg) {
        return "Hello " + msg;
    }

    @GetMapping("/db/{id}")
    public String getDemo(@PathVariable int id){
        return iDemoService.getDemo(id);
    }
}
