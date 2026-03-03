package com.makers.makersbnb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class StaticPageController {
    @GetMapping("/")
    public ModelAndView landingPage() {
        ModelAndView modelAndView = new ModelAndView("/LandingPage");
        Integer nSpaces = 100;
        modelAndView.addObject("nSpaces", nSpaces);
        String[] reviews = new String[] {"Awesome", "Nice", "Perfect"};
        modelAndView.addObject("reviews", reviews);
        return modelAndView;
    }

    @GetMapping("/contactus")
    public ModelAndView contactUsPage() {
        ModelAndView modelAndView = new ModelAndView("/ContactUs");
        String email = "thisisnotarealemail@notanemail.com";
        modelAndView.addObject("email", email);
        return  modelAndView;
    }
}
