package com.nofear.pattern.strategy;

import com.nofear.pattern.strategy.behaviour.Sword;
import com.nofear.pattern.strategy.model.Character;
import com.nofear.pattern.strategy.model.King;
import com.nofear.pattern.strategy.model.Troll;

public class Strategy {

    public static void main(String[] args) {

        Character k = new King();
        k.fight();

        k = new Troll();
        k.fight();
    }
}
