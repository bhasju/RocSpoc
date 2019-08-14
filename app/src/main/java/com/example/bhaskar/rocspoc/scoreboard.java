package com.example.bhaskar.rocspoc;

import android.app.Application;

public class scoreboard extends Application {
    public int score = 0;
    public int getScore(){
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

}
