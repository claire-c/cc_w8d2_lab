package com.codeclan.balazskertesz.rockpaperscissors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AnswerActivity extends AppCompatActivity {

    private TextView answerTextView;
    private TextView scoreTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);

        answerTextView = findViewById(R.id.answerTextViewID);
        scoreTextView = findViewById(R.id.scoreTextViewID);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String displayWinnerText = extras.getString("displayWinnerText");

        answerTextView.setText(displayWinnerText);
    }
}
