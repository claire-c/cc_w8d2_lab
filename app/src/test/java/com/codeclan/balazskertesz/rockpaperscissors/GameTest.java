package com.codeclan.balazskertesz.rockpaperscissors;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

    private Game game;

    @Before
    public void setup(){
        game = new Game();
    }

    @Test
    public void canGetPlayer(){
        assertEquals("", game.getPlayer());
    }

    @Test
    public void canSetPlayer(){
        game.setPlayer("Balasz");
        assertEquals("Balasz", game.getPlayer());
    }

    @Test
    public void canGetComputer(){
        assertEquals("", game.getComputer());
    }

    @Test
    public void canSetComputer(){
        game.setComputer("Claire");
        assertEquals("Claire", game.getComputer());
    }
}
