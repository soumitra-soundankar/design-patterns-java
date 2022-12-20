package com.nofear.pattern.strategy;

public class King extends Character{

    @Override
    public void fight() {
        getWeapon().useWeapon();
    }
}
