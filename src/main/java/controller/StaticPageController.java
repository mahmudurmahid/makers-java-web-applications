package com.makers.makersbnb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import com.makers.makersbnb.repository.SpaceRepository;
import com.makers.makersbnb.model.Space;
import java.util.List;

@RestController
public class StaticPageController {
    @Autowired
    SpaceRepository spaceRepository;

    @GetMapping("/")
    public ModelAndView welcome() {
        ModelAndView modelAndView = new ModelAndView("/LandingPage");
        Integer nSpaces = ((List<Space>) spaceRepository.findAll()).size();
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
