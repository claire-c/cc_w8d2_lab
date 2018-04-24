package com.codeclan.balazskertesz.rockpaperscissors;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class RockPaperScissorsActivity extends AppCompatActivity {

    Button rock;
    Button scissors;
    Button paper;

    TextView display;

    Game game;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rock_paper_scissors);
        rock = findViewById(R.id.buttonRockID);
        scissors = findViewById(R.id.buttonScissorsID);
        paper = findViewById(R.id.buttonPaperID);
        display = findViewById(R.id.textDisplay);
        game = new Game();
    }

    public void getPlayerHand(View view){
        Button button = (Button) view;
        game.setPlayer(button.getText().toString());
        game.randomComputerHand();
        displayText();

    }

    public void displayText(){
        display.setText("Player:"+game.getPlayer()+"Computer"+game.getComputer());
    }


}
