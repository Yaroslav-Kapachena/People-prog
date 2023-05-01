package com.example.Teams;

import com.example.Sportsmen.Sportsman;

import java.util.ArrayList;

public class Team {
    private ArrayList<Sportsman> team = new ArrayList<>();
    public Team(){
    }

    public Team(ArrayList<Sportsman> team) {
        this.team = team;
    }

    public ArrayList<Sportsman> getTeam() {
        return team;
    }

    public void setTeam(ArrayList<Sportsman> team) {
        this.team = team;
    }
    public  void teamAdd(Sportsman sportsman){
        team.add(sportsman);
    }
    public  void teamRemove(Sportsman sportsman){
        team.remove(sportsman);
    }
    public void teamWalk(Team team){
        for(Sportsman sportsman:getTeam()){
            sportsman.walk();
        }
    }
}
