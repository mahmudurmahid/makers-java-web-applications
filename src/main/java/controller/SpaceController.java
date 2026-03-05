package com.makers.makersbnb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import com.makers.makersbnb.model.Space;
import com.makers.makersbnb.repository.SpaceRepository;

import java.util.List;

@RestController
public class SpaceController {
    @Autowired
    SpaceRepository spaceRepository;

    @GetMapping("/spaces")
    public ModelAndView spaces() {
        ModelAndView modelAndView = new ModelAndView("/Spaces");
//        String[] spaces = (List<Space> spaceRepository.findAll());
//        modelAndView.addObject("spaces", spaces);
        modelAndView.addObject("spaces", spaceRepository.findAll());
        return modelAndView;
    }

}
