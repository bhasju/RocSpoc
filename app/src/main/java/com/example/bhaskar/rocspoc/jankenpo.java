package com.example.bhaskar.rocspoc;

import java.util.concurrent.ThreadLocalRandom;
  /*
    Scissors cuts Paper
    Paper covers Rock
    Rock crushes Lizard
    Lizard poisons Spock
    Spock smashes Scissors
    Scissors decapitates Lizard
    Lizard eats Paper
    Paper disproves Spock
    Spock vaporizes Rock
    (and as it always has) Rock crushes Scissors
    rock = 0
    paper = 1
    scissor = 2
    spock = 3
    lizard = 4
    */


public class jankenpo {
    int playermove;
    int appmove ;
    int result;
    String winninglogic;
    public jankenpo(int playermove){
        this.appmove = ThreadLocalRandom.current().nextInt(0, 4 + 1);
        this.playermove = playermove;
    }
    public void gameresult(){
        if(this.playermove == 0) { //rock
            switch (this.appmove) {
                case 0://rock
                    this.result = 2;
                    this.winninglogic = "This match is a Tie!";
                    break;
                case 1://paper
                    this.result = 0;
                    this.winninglogic = "Paper covers Rock";
                    break;
                case 2://scissors
                    this.result = 1;
                    this.winninglogic = "Rock crushes Scissors";
                    break;
                case 3://spock
                    this.result = 0;
                    this.winninglogic = "Spock vaporizes Rock";
                    break;
                case 4://lizard
                    this.result = 1;
                    this.winninglogic = "Rock crushes Lizard";
                    break;

            }
        }
        if(this.playermove == 1) { //paper
            switch (this.appmove) {
                case 0://rock
                    this.result = 1;
                    this.winninglogic = "Paper covers Rock";
                    break;
                case 1://paper
                    this.result = 2;
                    this.winninglogic = "This match is a Tie!";
                    break;
                case 2://scissor
                    this.result = 0;
                    this.winninglogic = "Scissors cuts Paper";
                    break;
                case 3://spock
                    this.result = 1;
                    this.winninglogic = "Paper disproves Spock";
                    break;
                case 4://lizard
                    this.result = 0;
                    this.winninglogic = "Lizard eats Paper";
                    break;

            }
        }
        if(this.playermove == 2) { //scissor
            switch (this.appmove) {
                case 0://spock
                    this.result = 0;
                    this.winninglogic = "Rock crushes Scissors";
                    break;
                case 1://paper
                    this.result = 1;
                    this.winninglogic = "Scissors cuts Paper";
                    break;
                case 2://scissor
                    this.result = 2;
                    this.winninglogic = "This match is a Tie!";
                    break;
                case 3://spock
                    this.result = 0;
                    this.winninglogic = "Spock smashes Scissors";
                    break;
                case 4://lizard
                    this.result = 1;
                    this.winninglogic = "Scissors decapitates Lizard";
                    break;
            }
        }
        if(this.playermove == 3) { //spock
            switch (this.appmove) {
                case 0://rock
                    this.result = 1;
                    this.winninglogic = "Spock vaporizes Rock";
                    break;
                case 1://paper
                    this.result = 0;
                    this.winninglogic = "Paper disproves Spock";
                    break;
                case 2://scissor
                    this.result = 1;
                    this.winninglogic = "Spock smashes Scissors";
                    break;
                case 3://spock
                    this.result = 2;
                    this.winninglogic = "This match is a Tie!";
                    break;
                case 4://lizard
                    this.result = 0;
                    this.winninglogic = "Lizard poisons Spock";
                    break;
            }
        }
        if(this.playermove == 4) { //lizard
            switch (this.appmove) {
                case 0://rock
                    this.result = 0;
                    this.winninglogic = "rock smashes lizard";
                    break;
                case 1://paper
                    this.result = 1;
                    this.winninglogic = "lizard eats paper";
                    break;
                case 2://scissor
                    this.result = 0;
                    this.winninglogic = "Scissors decapitates Lizard";
                    break;
                case 3://spock
                    this.result = 1;
                    this.winninglogic = "Lizard poisons Spock";
                    break;
                case 4://lizard
                    this.result = 2;
                    this.winninglogic = "This match is a Tie!";
                    break;
            }
        }
    }
}
