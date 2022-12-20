package com.nofear.pattern.strategy.behaviour;

public class Axe implements Weapon{
    @Override
    public void useWeapon() {
        System.out.println("Chopping with Axe");
    }
}
