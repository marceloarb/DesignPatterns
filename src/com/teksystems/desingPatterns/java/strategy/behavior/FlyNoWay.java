package com.teksystems.desingPatterns.java.strategy.behavior;

import com.teksystems.desingPatterns.java.strategy.Interfaces.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println(" I don't fly ");
    }
}
