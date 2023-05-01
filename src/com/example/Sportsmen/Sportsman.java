package com.example.Sportsmen;

import com.example.People.Gender;
import com.example.People.Person;
import com.example.People.Player;

public class Sportsman extends Person implements Player {
    public Sportsman() {
    }

    public Sportsman(String name, int age, Gender gender) {
        super(name, age, gender);
    }

    @Override
    public void walk() {
        System.out.println("Спортсмен идет");
    }

    @Override
    public void take() {
        System.out.println("Спортсмен берет сумку");
    }


}
