package com.nofear.pattern.decorator.model;

public abstract class Laptop {

    String description = "Basic";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
