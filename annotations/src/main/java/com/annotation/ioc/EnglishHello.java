package com.annotation.ioc;

public class EnglishHello implements Hello {
    @Override
    public void hello() {
        System.out.println("Hello!");
    }
}
