package com.nofear.pattern.strategy;

import com.nofear.pattern.strategy.behaviour.Sword;

public class Strategy {

    public static void main(String[] args) {

        Character k = new King();
        k.setWeapon(new Sword());
        k.fight();
    }
}
