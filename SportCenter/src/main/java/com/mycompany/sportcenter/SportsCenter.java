package com.mycompany.sportcenter;

import com.mycompany.sportcenter.scenario.Scenario;
import com.mycompany.sportcenter.sportsCenter.SportCenter;

public class SportsCenter {

    public static void main(String[] args) {
        //Estamos haciendo un ejercicio de deportes donde hayu jugadores canchas varios deportes entre otras cosas
        SportCenter sportCenter = new SportCenter("El camoin", "ASD", "Bogota", "24hr"); //Creamos un centro deportivo
        Scenario scenario1 = new Scenario (1800, TypeSport.SOCCER, "24hr"); //Creamos un escenario
        Scenario scenario2 = new Scenario (100, TypeSport.BASKETBALL, "24hr"); //Creamos un escenario
        
        sportCenter.addScenario(scenario1); //Al Centro de deporte le estamos agregando los escenarioa que ya habiamos creado
        sportCenter.addScenario(scenario2);
        
        sportCenter.bookScenario(scenario1); //Reservamos el escenario 1
        sportCenter.bookScenario(scenario2); //Reservamos el escenario 2
        sportCenter.bookScenario(scenario1); //Aqui el escenario ya estaria resrvado

    }
}
