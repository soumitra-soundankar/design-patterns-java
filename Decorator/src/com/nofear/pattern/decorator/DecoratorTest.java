package com.nofear.pattern.decorator;

import com.nofear.pattern.decorator.addons.GraphicsCard;
import com.nofear.pattern.decorator.addons.TouchDisplay;
import com.nofear.pattern.decorator.model.Laptop;
import com.nofear.pattern.decorator.model.LinuxBased;

public class DecoratorTest {

    public static void main(String[] args) {
        Laptop laptop = new LinuxBased();
        System.out.println(laptop.getDescription() + " - " + laptop.cost());

        laptop = new LinuxBased();
        laptop = new GraphicsCard(laptop);
        laptop = new TouchDisplay(laptop);
        System.out.println(laptop.getDescription() + " - " + laptop.cost());
    }
}
