package com.example.Main;

import com.example.Computer.Computer;
import com.example.Game.Game;
import com.example.People.*;
import com.example.Sportsmen.Sportsman;
import com.example.Teams.Team;

public class Main {
    public static void main(String[] args) {
        Player person1 = new Person("Яросла ",14, Gender.MASCULINE);
        Player person2 = new Person("Андрей",30,Gender.MASCULINE);
        Player person3 = new Person("Лиза",22,Gender.FEMALE);

        Player computer1 = new Computer("Apple","Intel core i5","16 gb");
        Player computer2 = new Computer("HP","intel core i7","32 gb");


        Game game = new Game();
        game.playerAdd(person1);
        game.playerAdd(person2);
        game.playerAdd(computer1);
        game.playerAdd(computer2);
        game.printInf(game);

        Sportsman footballPlayer1 = new Sportsman();
        Sportsman footballPlayer2 = new Sportsman();
        Sportsman footballPlayer3 = new Sportsman();
        Sportsman footballPlayer4 = new Sportsman();
        Sportsman footballPlayer5 = new Sportsman();
        Sportsman footballPlayer6 = new Sportsman();
        Sportsman footballPlayer7 = new Sportsman();
        Sportsman footballPlayer8 = new Sportsman();
        Sportsman footballPlayer9 = new Sportsman();
        Sportsman footballPlayer10 = new Sportsman();
        Sportsman footballPlayer11 = new Sportsman();

        Team team = new Team();
        team.teamAdd(footballPlayer1);
        team.teamAdd(footballPlayer2);
        team.teamAdd(footballPlayer3);
        team.teamAdd(footballPlayer4);
        team.teamAdd(footballPlayer5);
        team.teamAdd(footballPlayer6);

        team.teamWalk(team);
    }
}
