package com.example.Sportsmen;

import com.example.People.Gender;
import com.example.People.Person;

public class BasketballPlayer extends Person {
    private String height;
    public BasketballPlayer(){
    }

    public BasketballPlayer(String height) {
        this.height = height;
    }

    public BasketballPlayer(String name, int age, Gender gender, String height) {
        super(name, age, gender);
        this.height = height;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    @Override
    public void walk() {
        super.walk();
        System.out.println("Баскетболист идет на площадку");
    }
}
