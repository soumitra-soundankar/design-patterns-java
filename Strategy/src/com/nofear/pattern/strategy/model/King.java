package com.nofear.pattern.strategy.model;

import com.nofear.pattern.strategy.behaviour.Sword;
import com.nofear.pattern.strategy.behaviour.Weapon;

public class King extends Character{

    public King(){
        setWeapon(new Sword());
    }

    @Override
    public void fight() {
        getWeapon().useWeapon();
    }
}
