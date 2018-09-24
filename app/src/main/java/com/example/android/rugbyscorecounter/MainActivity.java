package com.example.android.rugbyscorecounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int HomeScore = 0;
    int AwayScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ScoreForHomeTeam();
    }

    public void ScoreForHomeTeam(){

        /**
         * This is the button for the Home Try
         */
        Button HomeTry = findViewById(R.id.HomeTry);
        HomeTry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HomeScore += 5;

                DisplayHomeScore(HomeScore);
            }
        });

    }

    public void DisplayHomeScore(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void DisplayAwayScore(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }



}
