package com.makers.makersbnb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StaticPageController {
    @GetMapping("/")
    public String landingPage() {
        return "Welcome to MakersBnB";
    }

    @GetMapping("/contactus")
    public String contactUsPage() {
        return "thisisnotarealemail@notanemail.com";
    }
}
