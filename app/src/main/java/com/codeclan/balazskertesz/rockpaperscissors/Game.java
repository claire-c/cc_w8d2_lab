package com.codeclan.balazskertesz.rockpaperscissors;

import java.util.Random;

public class Game {

    private String player;
    private String computer;

    public Game(){
        this.player = "";
        this.computer = "";
    }

    public String getPlayer() {
        return player;
    }

    public String getComputer() {
        return computer;
    }

    public void setComputer(String computer) {
        this.computer = computer;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public void randomComputerHand(){
        Random rand = new Random();
        int number = rand.nextInt(Logic.values().length);
        computer = Logic.values()[number].getValue();
    }


}
