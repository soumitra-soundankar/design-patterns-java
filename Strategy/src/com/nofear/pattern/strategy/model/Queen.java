package com.nofear.pattern.strategy.model;

import com.nofear.pattern.strategy.behaviour.Knife;

public class Queen extends Character {

    public Queen() {
        setWeapon(new Knife());
    }

    @Override
    public void fight() {
        getWeapon().useWeapon();
    }
}
