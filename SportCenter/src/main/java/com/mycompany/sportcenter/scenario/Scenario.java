package com.mycompany.sportcenter.scenario;

import com.mycompany.sportcenter.TypeSport;

public class Scenario {
    private int Capacity;
    private TypeSport typeSport;
    
    private String schedule;
    private boolean available;

    public Scenario(int Capacity, TypeSport typeSport, String schedule) {
        this.Capacity = Capacity;
        this.typeSport = typeSport;
        this.schedule = schedule;
        this.available = true;
    }
    
    
}
