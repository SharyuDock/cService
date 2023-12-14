package com.shg.cService.CController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CController {

    @GetMapping("/")
    public String getCustomer() {
        return "Spring Boot Customer";
    }
}
