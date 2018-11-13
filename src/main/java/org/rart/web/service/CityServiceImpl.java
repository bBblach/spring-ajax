package org.rart.web.service;

import org.rart.web.model.City;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CityServiceImpl implements CityService {
    @Override
    public List<String> getCityNamesForSelectedState(String state) {
        if (state.equals("Texas")){
            // === texas
            City houston = new City(1, "Houston");
            City sanAntonio = new City(2, "San Antonio");
            List<String> texasCities = new ArrayList<>();
            texasCities.add(houston.getName());
            texasCities.add(sanAntonio.getName());
           return texasCities;
        }else {
            City losAngeles = new City(1, "Los Angeles");
            City goldenState = new City(2, "Golden  State");
            List<String> californiaCities = new ArrayList<>();
            californiaCities.add(losAngeles.getName());
            californiaCities.add(goldenState.getName());
            return californiaCities;
        }
    }
}
