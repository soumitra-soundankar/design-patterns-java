package com.nofear.pattern.strategy.model;

import com.nofear.pattern.strategy.behaviour.Axe;

public class Troll extends Character {

    public Troll() {
        setWeapon(new Axe());
    }

    @Override
    public void fight() {
        getWeapon().useWeapon();
    }
}
