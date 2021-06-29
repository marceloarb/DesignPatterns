package com.teksystems.desingPatterns.java.strategy.behavior;

import com.teksystems.desingPatterns.java.strategy.Interfaces.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I am flying");
    }
}
