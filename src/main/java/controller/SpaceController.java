package com.makers.makersbnb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;
import com.makers.makersbnb.model.Space;
import com.makers.makersbnb.repository.SpaceRepository;

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

    @GetMapping("/spaces/new")
    public ModelAndView newSpaceForm() {
        // this is the space referred to in th:object (look back at the form code)
        Space space = new Space();
        ModelAndView newSpaceForm = new ModelAndView("spaces/new");
        newSpaceForm.addObject("space", space);
        return newSpaceForm;
    }

    @PostMapping("/spaces")
// Spring Boot uses the form data to create an instance of space
// which is then passed in as an arg here
    public RedirectView create(Space space) {
        spaceRepository.save(space);
        // assumes you already created a method to handle `GET "/spaces"`
        return new RedirectView("/spaces");
    }
}
