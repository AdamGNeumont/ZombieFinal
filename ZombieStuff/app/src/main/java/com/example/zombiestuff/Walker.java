package com.example.zombiestuff;

public class Walker extends Zombie {
    public Walker(){
        actions = 1;
        health = 10;
    }

    @Override
    public void resetZombieActions() {
        actions = 1;
    }

    @Override
    public String toString() {
        return null;
    }

    @Override
    public int rollForAttackDamage() {
        return rand.nextInt(6)+2;
    }

    @Override
    public void lowerSpeed() {
        actions--;
    }

    @Override
    public String display() {
        return "W";
    }
}
