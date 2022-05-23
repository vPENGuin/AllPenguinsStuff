package com.penguin;

import java.io.IOException;

public class DoSmth implements Do{
    @Override
    public void one() throws IOException {
        new IOException();
    }
}
