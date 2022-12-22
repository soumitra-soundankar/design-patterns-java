package com.nofear.pattern.decorator.model;

public class WindowsBased extends Laptop{

    public WindowsBased() {
        description = "Windows";
    }

    @Override
    public double cost() {
        return 40000;
    }
}
