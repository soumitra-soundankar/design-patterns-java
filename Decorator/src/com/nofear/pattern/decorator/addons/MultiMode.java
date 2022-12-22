package com.nofear.pattern.decorator.addons;

import com.nofear.pattern.decorator.model.Laptop;

public class MultiMode extends LaptopDecorator {

    public MultiMode(Laptop laptop) {
        this.laptop = laptop;
    }

    @Override
    public double cost() {
        return this.laptop.cost() + 10000;
    }

    @Override
    public String getDescription() {
        return this.laptop.getDescription() + ", 2-in-1 Device";
    }
}
