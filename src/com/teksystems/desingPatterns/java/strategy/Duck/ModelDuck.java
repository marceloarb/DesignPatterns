package com.teksystems.desingPatterns.java.strategy.Duck;

import com.teksystems.desingPatterns.java.strategy.behavior.FlyNoWay;
import com.teksystems.desingPatterns.java.strategy.behavior.Quack;

public class ModelDuck extends Duck{

    public ModelDuck (){
        flyBehavior = new FlyNoWay();
        quakBehavior = new Quack();
    }
}
