package com.codeclan.balazskertesz.rockpaperscissors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class RockPaperScissorsActivity extends AppCompatActivity {

    Button rock;
    Button scissors;
    Button paper;

    TextView instructions;
    TextView score;

    Game game;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rock_paper_scissors);
        rock = findViewById(R.id.buttonRockID);
        scissors = findViewById(R.id.buttonScissorsID);
        paper = findViewById(R.id.buttonPaperID);
        instructions = findViewById(R.id.textDisplay);
        score = findViewById(R.id.scoreID);
        game = new Game();

        Log.d(getClass().toString(), "In the Game onCreate");


        setButtonColors();
    }

    public void getPlayerHand(View view){

        Button button = (Button) view;
        game.setPlayer(button.getText().toString());
        game.randomComputerHand();


        String displayWinnerText = displayWinnerText();
        String displayScore = displayScore();

        Intent intent = new Intent(this, AnswerActivity.class);
        intent.putExtra("displayWinnerText", displayWinnerText);
        intent.putExtra("displayScore", displayScore);
        startActivity(intent);
        displayScoreFrontPage();

    }

    public String displayWinnerText(){
     return game.handsPlayedText();
    }

    public String displayScore(){
        return game.displayScore();
    }

    public void displayScoreFrontPage(){
        score.setText(game.displayScore());
    }

    public void setButtonColors(){
        rock.setBackgroundColor(getResources().getColor(R.color.rockButton));
        paper.setBackgroundColor(getResources().getColor(R.color.paperButton));
        scissors.setBackgroundColor(getResources().getColor(R.color.scissorButton));
    }


}
