package org.rart.web.service;

import org.rart.web.model.City;
import org.rart.web.model.State;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StateServiceMockImpl implements StateService {


    @Override
    public List<State> getAllStates() {

        List<State> states = new ArrayList<>();
        State texas = new State(1, "Texas");
        State california = new State(2, "California");
        // === texas
        City houston = new City(1, "Houston");
        City sanAntonio = new City(2, "San Antonio");
        List<City> texasCities = new ArrayList<>();
        texasCities.add(houston);
        texasCities.add(sanAntonio);
        texas.setCities(texasCities);
        // ===  california

        City losAngeles = new City(1, "Los Angeles");
        City goldenState = new City(2, "Golden  State");
        List<City> californiaCities = new ArrayList<>();
        californiaCities.add(losAngeles);
        californiaCities.add(goldenState);
        california.setCities(californiaCities);

        states.add(texas);
        states.add(california);
        return states;

    }

    @Override
    public List<String> getAllStatesNames() {
        List<State> states = getAllStates();
        List<String> stateNames = new ArrayList<>();
        for (State state : states){
            stateNames.add(state.getName());
        }
        return stateNames;
    }
}
