package com.nofear.pattern.decorator.model;

public class MacBased extends Laptop{

    public MacBased() {
        description = "MacOS";
    }

    @Override
    public double cost() {
        return 60000;
    }
}
