package com.mycompany.sportcenter.people;

import com.mycompany.sportcenter.Role;
import com.mycompany.sportcenter.TypeSport;

public class Sportman extends Person implements Doping, Diet{
    private TypeSport typesport;
    private Category category;

    public Sportman(TypeSport typesport, Category category, String name, String ID, int age, String gender, Role role) {
        super(name, ID, age, gender, role);
        this.typesport = typesport;
        this.category = category;
    }

    @Override
    public void doDopingTest() {
        System.out.println("Realizando el test de dopaje");
    }

    @Override
    public void doDiet() {
        if(this.typesport == TypeSport.BASKETBALL){
            System.out.println("Dieta bascketollera");
            return;
        }
        
        if(this.typesport == TypeSport.SOCCER){
            System.out.println("Dieta futbolera");
            return;
        } 
        
        if(this.typesport == TypeSport.VOLLEYBALL){
            System.out.println("Dieta boleybolera");
            //No neesita return
        }
    }
}
