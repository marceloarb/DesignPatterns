package com.teksystems.desingPatterns.java.strategy.Duck;

import com.teksystems.desingPatterns.java.strategy.Interfaces.FlyBehavior;
import com.teksystems.desingPatterns.java.strategy.Interfaces.QuakBehavior;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuakBehavior quakBehavior;

    public Duck(){

    }
    public void performQuack(){
        quakBehavior.quack();
    }
    public void performFly(){
        flyBehavior.fly();
    }
}
