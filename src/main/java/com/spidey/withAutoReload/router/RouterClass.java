package com.spidey.withAutoReload.router;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class RouterClass {
    @GetMapping("/Hello")
    public String printHello() {
        return "Hello this is spidey reload";
    }

    @GetMapping("/Pengi")
    public String printPengi(){
        return "Hello this is pengi";
    }

    @GetMapping("/")
    public String welcome(){
        return "Welcome";
    }
}
