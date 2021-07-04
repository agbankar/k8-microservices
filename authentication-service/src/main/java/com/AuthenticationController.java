package com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")

public class AuthenticationController {
    @GetMapping("/getToken")
    public String getAuthToken() {

        return "Bearer ENgQ3eoaU0yZH6VFtyEiTvznaIiQ";
    }
}
