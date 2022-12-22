package com.nofear.pattern.decorator.addons;

import com.nofear.pattern.decorator.model.Laptop;

public abstract class LaptopDecorator extends Laptop {

    Laptop laptop;

    public abstract String getDescription();

}
