package com.example.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Globals
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    //End of Globals

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
// display score for TEAM A
    public void displayForTeamA(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
// display score for TEAM B
    public void displayForTeamB(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
// Events for buttons in TEAM A
    public void add3(View view) {
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }

    public void add2(View view) {
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }

    public void add1(View view) {
        scoreTeamA ++;
        displayForTeamA(scoreTeamA);
    }
// Events for buttons in TEAM B
    public void addThreeToTeamBScore(View view){
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);
    }

    public void addTwoToTeamBScore(View view){
        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);
    }

    public void addOneToTeamBScore(View view){
        scoreTeamB ++;
        displayForTeamB(scoreTeamB);
    }

    // onClick event for the reset Button
    public void reset(View view){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

}
