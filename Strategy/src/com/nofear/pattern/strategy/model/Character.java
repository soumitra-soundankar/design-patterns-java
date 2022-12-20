package com.nofear.pattern.strategy.model;

import com.nofear.pattern.strategy.behaviour.Weapon;

public abstract class Character {

    private Weapon weapon;

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public abstract void fight();
}
