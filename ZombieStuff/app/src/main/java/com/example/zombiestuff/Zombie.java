package com.example.zombiestuff;

import java.util.Random;

public abstract class Zombie {
    protected int actions;
    protected int health;
    Random rand = new Random();

    public abstract void resetZombieActions();

    public abstract String toString();

    public abstract int rollForAttackDamage();

    public abstract void lowerSpeed();

    public abstract String display();
}
