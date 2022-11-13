package com.example.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/response")
public class ApiTest {

    @PostMapping("/postbody")
    public String postBody(@RequestBody String fullName) {
        System.out.println("Receive post body -> " + fullName);
        return "Hello " + fullName;
    }
}
