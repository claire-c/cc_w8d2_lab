package com.codeclan.balazskertesz.rockpaperscissors;

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
}
