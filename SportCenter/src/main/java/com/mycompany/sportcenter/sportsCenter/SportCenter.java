package com.mycompany.sportcenter.sportsCenter;

import com.mycompany.sportcenter.scenario.Scenario;
import java.util.ArrayList;
import java.util.List;

public class SportCenter {
    private String name;
    private String ID;
    private String location;
    private String schedule;
    
    List<Scenario> scenarios = new ArrayList<>();

    public SportCenter(String name, String ID, String location, String schedule) {
        this.name = name;
        this.ID = ID;
        this.location = location;
        this.schedule = schedule;
    }
    
    public void addScenario (Scenario scenario){
        this.scenarios.add(scenario);
    }
}
