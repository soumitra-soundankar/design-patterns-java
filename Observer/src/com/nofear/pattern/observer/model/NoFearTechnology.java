package com.nofear.pattern.observer.model;

public class NoFearTechnology implements Observer, Display {

    private int editionId;


    @Override
    public void update(int editionId) {
        this.editionId = editionId;
        System.out.println(this);
    }

    @Override
    public void displayNewsPaper() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "NoFearTechnology{" +
                "editionId=" + editionId +
                '}';
    }
}
