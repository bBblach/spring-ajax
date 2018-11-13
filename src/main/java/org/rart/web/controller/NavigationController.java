package org.rart.web.controller;

import org.rart.web.model.State;
import org.rart.web.service.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping("/")

public class NavigationController {

    StateService stateService;

    @Autowired
    public NavigationController(StateService stateService) {
        this.stateService = stateService;
    }

    @RequestMapping(value = "/example1", method = RequestMethod.GET)
    public ModelAndView getExample1() {
        ModelAndView modelAndView = new ModelAndView("example1");
        List<State> stateList = new ArrayList<>();
        stateList = stateService.getAllStates();

        if (!stateList.isEmpty()) {
            modelAndView.addObject("stateList", stateList);
        }
        return modelAndView;
    }
}
