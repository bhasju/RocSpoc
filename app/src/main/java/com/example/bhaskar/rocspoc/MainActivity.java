package com.example.bhaskar.rocspoc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final scoreboard scoreObj = (scoreboard)getApplicationContext();
        Intent thisintent = getIntent();
        boolean isNew = thisintent.getBooleanExtra("isNew",true);
        if(isNew){
            String openingCredit = "made by Bhaskar";
            Toast.makeText(getApplicationContext(), openingCredit, Toast.LENGTH_LONG).show();

        }
    }
    public void onClickPlay(View view){
        Intent intent = new Intent(this,result_display.class);
        switch(view.getId()){
            case R.id.rock:
                intent.putExtra("message", 0);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
                break;
            case R.id.paper:
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                intent.putExtra("message", 1);

                startActivity(intent);
                break;
            case R.id.scissor:
                intent.putExtra("message", 2);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);


                startActivity(intent);
                break;
            case R.id.spock:
                intent.putExtra("message", 3);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);


                startActivity(intent);
                break;
            case R.id.lizard:
                intent.putExtra("message", 4);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);


                startActivity(intent);
                break;
        }

    }
}