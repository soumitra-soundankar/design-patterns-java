package com.nofear.pattern.decorator.model;

public class LinuxBased extends Laptop{

    public LinuxBased() {
        description = "Linux";
    }

    @Override
    public double cost() {
        return 14000;
    }

}
