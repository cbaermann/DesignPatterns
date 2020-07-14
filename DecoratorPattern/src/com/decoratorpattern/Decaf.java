package com.decoratorpattern;

public class Decaf extends Beverage {

    public Decaf(){
        description = "Decaf Coffee, what a waste!";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
