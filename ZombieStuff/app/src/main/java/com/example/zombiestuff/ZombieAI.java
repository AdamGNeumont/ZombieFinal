package com.example.zombiestuff;

public class ZombieAI {
    private boolean checkLeft(String[][] theGameBoard, int zombiePositionHorizontal, int zombiePositionVertical){
        if(theGameBoard[zombiePositionHorizontal - 1][zombiePositionVertical] == null){
            return false;
        } else { return true;}
    }
    private boolean checkRight(String[][] theGameBoard, int zombiePositionHorizontal, int zombiePositionVertical){
        if(theGameBoard[zombiePositionHorizontal + 1][zombiePositionVertical] == null){
            return false;
        } else {return true;}
    }
    private boolean checkTop(String[][] theGameBoard, int zombiePositionHorizontal, int zombiePositionVertical){
        if(theGameBoard[zombiePositionHorizontal][zombiePositionVertical + 1] == null){
            return false;
        } else {return true;}
    }
    private boolean checkBottom(String[][] theGameBoard, int zombiePositionHorizontal, int zombiePositionVertical){
        if(theGameBoard[zombiePositionHorizontal][zombiePositionVertical - 1] == null){
            return false;
        } else {return true;}
    }
    public boolean checkForPlayer(String[][] gameBoard, int zombiePositionHorizontal, int zombiePositionVertical){
        if (checkLeft(gameBoard, zombiePositionHorizontal, zombiePositionVertical) == true
                || checkRight(gameBoard, zombiePositionHorizontal, zombiePositionVertical) == true
                || checkTop(gameBoard, zombiePositionHorizontal, zombiePositionVertical) == true
                || checkBottom(gameBoard, zombiePositionHorizontal, zombiePositionVertical) == true){
            //if there is a player ajacent
            return true;
        } else {
            //if there isn't a player ajacent
            return false;
        }
    }

    //Ints that show how far away in each direction a player is
    public int checkDown(String[][] checkThisColumn, int zombiePositionHorizontal, int zombiePositionVertical){
        for (int i = 1; i < 12; i++) {
            if (checkThisColumn[zombiePositionHorizontal][zombiePositionVertical + i] != null) {
                return i;
            }
        }
        return 200;
    }

    public int checkRightRow(String[][] checkRightRowOfZombie, int zombiePositionHorizontal, int zombiePositionVertical) {
        for (int i = 1; i < 7; i++) {
            if (checkRightRowOfZombie[zombiePositionHorizontal + i][zombiePositionVertical] != null) {
                return i;
            }
        }
        return 200;
    }

    public int checkLeftRow(String[][] checkLeftRowOfZombie, int zombiePositionHorizontal, int zombiePositionVertical){
        for (int i = 1; i < 7; i++) {
            if (checkLeftRowOfZombie[zombiePositionHorizontal - i][zombiePositionVertical] != null) {
                return i;
            }
        }
        return 200;
    }

    //When moving left or right, make sure to add the amount down the Zombie would have to move in addition to the amount left or right
    public String[][] moveZombieDown(Zombie theZombieMoving, int zombiePositionHorizontal, int zombiePositionVertical){}
    public String[][] moveZombieLeft(Zombie theZombieMoving, int zombiePositionHorizontal, int zombiePositionVertical){}
    public String[][] moveZombieRight(Zombie theZombieMoving, int zombiePositionHorizontal, int zombiePositionVertical){}



    public void actualZombieAI(String[][] theGameBoard, Zombie theZombieInQuestion, int zombiePositionHorizontal, int zombiePositionVertical) {
        while (theZombieInQuestion.actions > 0) {
            if (checkForPlayer(theGameBoard, zombiePositionHorizontal, zombiePositionVertical) == true) {
                //This bit will attack the player
            }
            if (checkDown(theGameBoard, zombiePositionHorizontal,zombiePositionVertical) > checkLeftRow(theGameBoard, zombiePositionHorizontal, zombiePositionVertical) && checkDown(theGameBoard, zombiePositionHorizontal,zombiePositionVertical) > checkRightRow(theGameBoard, zombiePositionHorizontal,zombiePositionVertical)){
                moveZombieDown(theZombieInQuestion, zombiePositionHorizontal, zombiePositionVertical);
            }
            else if (checkRightRow(theGameBoard, zombiePositionHorizontal, zombiePositionVertical) > checkLeftRow(theGameBoard, zombiePositionHorizontal,zombiePositionVertical) && checkRightRow(theGameBoard, zombiePositionHorizontal, zombiePositionVertical) > checkDown(theGameBoard, zombiePositionHorizontal, zombiePositionVertical)){
                moveZombieRight(theZombieInQuestion, zombiePositionHorizontal, zombiePositionVertical);
            }
            else if(checkLeftRow(theGameBoard, zombiePositionHorizontal, zombiePositionVertical) > checkRightRow(theGameBoard, zombiePositionHorizontal, zombiePositionVertical) && checkLeftRow(theGameBoard, zombiePositionHorizontal, zombiePositionVertical) > checkDown(theGameBoard, zombiePositionHorizontal, zombiePositionVertical)){
                moveZombieLeft(theZombieInQuestion, zombiePositionHorizontal, zombiePositionVertical);
            }
            else{
                moveZombieDown(theZombieInQuestion, zombiePositionHorizontal, zombiePositionVertical);
            }
        }
    }
}
