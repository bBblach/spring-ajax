package org.rart.web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {


    @RequestMapping(value = "/")
    public String getMainPgage(){
        return  "home-page";
    }
}

