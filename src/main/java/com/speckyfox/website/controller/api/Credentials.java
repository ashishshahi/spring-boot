package com.speckyfox.website.controller.api;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Credentials {

    @PostMapping(value="/validateLogin")
    public String validateLogin()
    {

        return "";
    }

}
