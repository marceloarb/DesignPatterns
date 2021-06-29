package com.teksystems.desingPatterns.java.strategy;

import com.teksystems.desingPatterns.java.strategy.Duck.MallardDuck;

public class application {
    public static void main(String args[]){
        System.out.println("hello");
        MallardDuck mallard = new MallardDuck();
        mallard.performQuack();
    }
}
