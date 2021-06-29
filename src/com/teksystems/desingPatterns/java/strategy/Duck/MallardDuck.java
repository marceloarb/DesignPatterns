package com.teksystems.desingPatterns.java.strategy.Duck;

import com.teksystems.desingPatterns.java.strategy.behavior.FlyWithWings;
import com.teksystems.desingPatterns.java.strategy.behavior.Quack;

public class MallardDuck extends Duck {

    public MallardDuck(){
        quakBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }


}
