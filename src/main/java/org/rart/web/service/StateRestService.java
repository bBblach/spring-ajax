package org.rart.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/example1")
public class StateRestService {

    private CityService cityService;

    @Autowired
    public StateRestService(CityService cityService) {
        this.cityService = cityService;
    }

    @RequestMapping(value = "getCitiesForSelectedState", method = RequestMethod.POST)
    public @ResponseBody
    List<String> getCitiesForSelectedState(@RequestParam(value = "state", required = true) String state) {
        System.out.print("\n\n\n in getcities method with stateName : "+state);
        List<String> cityList = new ArrayList<String>();
        cityList.add("Select City");
        //This way seems to be more dynamic for me no need to update the class if we add new state
        cityList.addAll(cityService.getCityNamesForSelectedState(state));

        return cityList;
    }
}