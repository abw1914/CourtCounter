package com.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayForTeamA(int score) {
        TextView teamAScore = findViewById(R.id.team_A_Score);
        teamAScore.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView teamBScore = findViewById(R.id.team_B_Score);
        teamBScore.setText(String.valueOf(score));
    }
    public void displayThree(View view) {
        int threePoints = 3;
        scoreTeamA = scoreTeamA + threePoints++;
        displayForTeamA(scoreTeamA);

    }
    public void displayThreeTeamB(View view) {
        int threePoints = 3;
        scoreTeamB = scoreTeamB + threePoints++;
        displayForTeamB(scoreTeamB);
    }

    public void displayTwo(View view) {
        int twoPoints = 2;
        scoreTeamA = scoreTeamA + twoPoints++;
        displayForTeamA(scoreTeamA);

    }
    public void displayTwoTeamB(View view) {
        int twoPoints = 2;
        scoreTeamB = scoreTeamB + twoPoints++;
        displayForTeamB(scoreTeamB);

    }
    public void displayOne(View view) {
        int freeThrow = 1;
        scoreTeamA = scoreTeamA + freeThrow++;
        displayForTeamA(scoreTeamA);
    }
    public void displayOneTeamB(View view) {
        int freeThrow = 1;
        scoreTeamB = scoreTeamB + freeThrow++;
        displayForTeamB(scoreTeamB);
    }

    public void clearScore(View view) {
        scoreTeamA = 0;
        displayForTeamA(scoreTeamA);

        scoreTeamB = 0;
        displayForTeamB(scoreTeamB);

    }
}
