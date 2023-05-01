package com.example.Sportsmen;

import com.example.People.Gender;
import com.example.People.Person;

public class SoccerPlayer extends Person {
    private  String position;
    public SoccerPlayer(){
    }

    public SoccerPlayer(String position) {
        this.position = position;
    }

    public SoccerPlayer(String name, int age, Gender gender, String position) {
        super(name, age, gender);
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public void walk() {
        super.walk();
        System.out.println("Футболист идет на поле");
    }
}
