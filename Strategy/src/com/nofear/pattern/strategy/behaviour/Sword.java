package com.nofear.pattern.strategy.behaviour;

public class Sword implements Weapon {
    @Override
    public void useWeapon() {
        System.out.println("Swinging Sword");
    }
}
