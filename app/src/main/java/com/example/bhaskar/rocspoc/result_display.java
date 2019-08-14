package com.example.bhaskar.rocspoc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class result_display extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_display);
        Intent thisintent = getIntent();
        int playermove = thisintent.getIntExtra("message",0);
        jankenpo match = new jankenpo(playermove);
        match.gameresult();
        int res = match.result;
        int appmove =match.appmove;
        final scoreboard scoreObj;
        scoreObj = (scoreboard)getApplicationContext();
        int score1 = scoreObj.getScore();
        String logic1 =match.winninglogic;
        int movename[] = {R.drawable.rock,R.drawable.paper,R.drawable.scissors,R.drawable.spock,R.drawable.lizard};
        String restext[] = {"You Lose!","You Win!", "Match Draw!"};
        int playermoveT = movename[playermove];
        int appmoveT = movename[appmove];
        String resT = restext[res];
        if(res==1) {
            scoreObj.setScore(score1 + 1);
        }
        TextView result = (TextView)findViewById(R.id.result);
        TextView logic = (TextView)findViewById(R.id.logic);
        TextView score = (TextView)findViewById(R.id.score);
        ImageView player= (ImageView) findViewById(R.id.player);
        ImageView app= (ImageView) findViewById(R.id.app);
        result.setText(resT);
        logic.setText(logic1);
        String scoreT = "Score="+Integer.toString(scoreObj.getScore());
        score.setText(scoreT);

        player.setImageResource(playermoveT);
        app.setImageResource(appmoveT);


    }
    public void onClickPlayAgain(View view){

        Intent restart = new Intent(this,MainActivity.class);
        restart.putExtra("isNew",false);
        restart.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(restart);


    }



}