package com.example.zombiestuff;

public class Toolbox {
    public boolean swapTurn(boolean currentTurn){
        if (currentTurn == true){
            //True will be Player Turn
            return false;
        } else {
            //False will be Zombie Turn
            return true;
        }
    }

    public String deathString(int playerEndScore, String className) {
        int placeholder = 50;
        if (playerEndScore <= placeholder) {
            return "Wow, you SUCK! You were killed by a "+className+". \nScore: "+playerEndScore;
        } else {
            return "Great work Survivor! You were killed by a "+className+". \nScore: "+playerEndScore;
        }
    }
}
