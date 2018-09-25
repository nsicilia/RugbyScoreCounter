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
    }


    @Override
    protected void onResume() {
        super.onResume();
        ScoreForHomeTeam();
    }

    public void ScoreForHomeTeam(){

        /**
         * This is the button for the Home Try adding 5 to the score
         * and updating score display
         */
        Button HomeTry = findViewById(R.id.HomeTry);
        HomeTry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HomeScore += 5;
                DisplayHomeScore(HomeScore);
            }
        });

        /**
         * The button for Home Conversion adding 2 to the score
         * and updating score display
         */
        Button HomeConversion = findViewById(R.id.HomeConversion);
        HomeConversion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HomeScore += 2;
                DisplayHomeScore(HomeScore);
            }
        });

        /**
         * The button for Home Drop Goal adding 3 to the score
         * and updating score display
         */
        Button HomeDropGoal = findViewById(R.id.HomeDropGoal);
        HomeDropGoal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HomeScore += 3;
                DisplayHomeScore(HomeScore);
            }
        });

        /**
         * The button for Home Drop Goal adding 3 to the score
         * and updating score display
         */
        Button HomePenalty = findViewById(R.id.HomePenalty);
        HomePenalty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HomeScore += 3;
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
