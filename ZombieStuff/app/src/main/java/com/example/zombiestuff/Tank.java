package com.example.zombiestuff;

public class Tank extends Zombie {
    public Tank(){
        actions = 1;
        health = 15;
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
        return rand.nextInt(8)+1;
    }

    @Override
    public void lowerSpeed() {
        actions--;
    }

    @Override
    public String display() {
        return "T";
    }
}
