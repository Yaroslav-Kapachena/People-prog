package com.example.Teams;

import com.example.People.Gender;
import com.example.People.Person;

public class NationalFootballTeam extends Person {
    private  int numberOfPlayer;
    public NationalFootballTeam(){
    }

    public NationalFootballTeam(int numberOfPlayer) {
        this.numberOfPlayer = numberOfPlayer;
    }

    public NationalFootballTeam(String name, int age, Gender gender, int numberOfPlayer) {
        super(name, age, gender);
        this.numberOfPlayer = numberOfPlayer;
    }
}
