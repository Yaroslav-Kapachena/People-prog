package com.example.Game;

import com.example.Computer.Computer;
import com.example.People.Person;
import com.example.People.Player;

import java.util.ArrayList;

public class Game {
    private ArrayList<Player> personAndComputerGame = new ArrayList<>();

    public Game() {
    }

    public Game(ArrayList<Player> personAndComputerGame) {
        this.personAndComputerGame = personAndComputerGame;
    }

    public ArrayList<Player> getPersonAndComputerGame() {
        return personAndComputerGame;
    }

    public void setPersonAndComputerGame(ArrayList<Player> personAndComputerGame) {
        this.personAndComputerGame = personAndComputerGame;
    }

    public void printInf(Game game) {
        for (Player player : game.personAndComputerGame) {
            if (player instanceof Person) {
                System.out.println("Участник игры: "+((Person) player).getName());
            }
            if (player instanceof Computer){
                System.out.println("Участник игры: "+((Computer) player).getBrand());
            }
        }
    }

    public void playerAdd(Player player) {
        personAndComputerGame.add(player);
    }

    public void playerRemove(Player player) {
        personAndComputerGame.remove(player);
    }

}
