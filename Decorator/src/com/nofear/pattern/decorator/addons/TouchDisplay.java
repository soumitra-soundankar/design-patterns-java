package com.nofear.pattern.decorator.addons;

import com.nofear.pattern.decorator.model.Laptop;

public class TouchDisplay extends LaptopDecorator {

    public TouchDisplay(Laptop laptop) {
        this.laptop = laptop;
    }

    @Override
    public double cost() {
        return this.laptop.cost() + 20000;
    }

    @Override
    public String getDescription() {
        return this.laptop.getDescription() +  ", Touch Display";
    }
}
