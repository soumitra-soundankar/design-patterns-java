package com.nofear.pattern.strategy.model;

import com.nofear.pattern.strategy.behaviour.BowAndArrow;

public class Knight extends Character {

    public Knight() {
        setWeapon(new BowAndArrow());
    }

    @Override
    public void fight() {
        getWeapon().useWeapon();
    }
}
