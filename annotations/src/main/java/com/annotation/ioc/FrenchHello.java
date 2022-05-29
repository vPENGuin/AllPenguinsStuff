package com.annotation.ioc;

public class FrenchHello implements Hello{
    @Override
    public void hello() {
        System.out.println("Bonjour!");
    }
}
