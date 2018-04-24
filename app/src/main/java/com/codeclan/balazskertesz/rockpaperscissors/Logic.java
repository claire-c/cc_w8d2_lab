package com.codeclan.balazskertesz.rockpaperscissors;

public enum Logic {

    ROCK("Scissors"),
    PAPER("Rock"),
    SCISSORS("Paper");

    private String value;

    Logic(String value){
        this.value = value;
    }

    public String getValue(){
        return this.value;
    }




}
