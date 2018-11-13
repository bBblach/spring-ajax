package org.rart.web.service;

import org.rart.web.model.City;

import java.util.List;

public interface CityService {

    List<String> getCityNamesForSelectedState(String state);

}
