package com.example.zombiestuff;

public class Runner extends Zombie{
    public Runner(){
        actions = 2;
        health = 5;
    }

    @Override
    public void resetZombieActions() {
        actions = 2;
    }

    @Override
    public String toString() {
        return null;
    }

    @Override
    public int rollForAttackDamage() {
        return rand.nextInt(5);
    }

    @Override
    public void lowerSpeed(){
        actions--;
    }

    @Override
    public String display() {
        return "R";
    }
}
