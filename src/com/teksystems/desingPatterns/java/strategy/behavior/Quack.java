package com.teksystems.desingPatterns.java.strategy.behavior;

import com.teksystems.desingPatterns.java.strategy.Interfaces.QuakBehavior;

public class Quack implements QuakBehavior {
    @Override
    public void quack() {
        System.out.println("The duck is making a sound");
    }
}
