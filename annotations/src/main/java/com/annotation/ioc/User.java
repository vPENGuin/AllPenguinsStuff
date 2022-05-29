package com.annotation.ioc;

public class User {
    private String language;

//    @Hello
    private Hello hello; // new FrenchHello | new EnglishHello ---> 2 var

    // hello.hello();
}
