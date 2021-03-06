package com.example.zombiefinal.Model;

import static com.example.zombiefinal.View.MainActivity.sword;

public class Warrior extends Player {

    @Override
    public void setMaxHealth(){
        this.maxHealth = 25;
    }

    public void setWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    public Warrior(Weapon weapon){
        setMaxHealth();
        setWeapon(weapon);
        this.currentHealth = maxHealth;
        this.actions = 3;
        setWeapon(sword);
    }

}
