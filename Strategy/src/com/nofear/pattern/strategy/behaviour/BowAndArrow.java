package com.nofear.pattern.strategy.behaviour;

public class BowAndArrow implements Weapon{
    @Override
    public void useWeapon() {
        System.out.println("Aiming with Bow and Arrow");
    }
}
