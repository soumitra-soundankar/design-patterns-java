package com.nofear.pattern.decorator.addons;

import com.nofear.pattern.decorator.model.Laptop;

public class GraphicsCard extends LaptopDecorator {

    public GraphicsCard(Laptop laptop) {
        this.laptop = laptop;
    }

    @Override
    public double cost() {
        return this.laptop.cost() + 6000;
    }

    @Override
    public String getDescription() {
        return this.laptop.getDescription() + ", Nvidia GeForce";
    }
}
