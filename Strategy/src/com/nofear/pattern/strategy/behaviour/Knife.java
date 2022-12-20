package com.nofear.pattern.strategy.behaviour;

public class Knife implements Weapon{
    @Override
    public void useWeapon() {
        System.out.println("Cutting with Axe");
    }
}
