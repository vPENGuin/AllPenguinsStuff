package com.penguin;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
//        throw new IOException();
//        throw new RuntimeException();
        try {
            one();
        } catch (Exception e) {
            System.out.println("Ошибка: " + Arrays.toString(e.getStackTrace()));
        }
        System.out.println("Привет!");
    }

    public static void one() {
        two();
    }

    public static void two() {
        three();
        three_one();
    }

    public static void three() throws ClientException {
//        throw new RuntimeException();
        try {
            if (new Random().nextInt() > 10) {
                throw new IOException();
            }
            throw new ClassNotFoundException();
        } catch (IOException e) {
            // обрабатываешь / исправляешь
            System.out.println("выпала такая-то ошибка, измекнте фывтфоыафлыафолыаолф");
            throw new ClientException("Блин, не смог считать файлик tree_rows.txt");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void three_one() {
        throw new RuntimeException();
    }

    // пул имен размером 10
    public static List<String> getNames(int n) {
        int poolSize = 10;
        ArrayList<Object> names = new ArrayList<>();
        names.add("Maxim");
        names.add("Peng");
        ///....
        if (n > poolSize) {
            throw new RuntimeException("Дохуя хочешь");
        }
//        throw new RuntimeException("Че-то сломалось, смотри сам");
        try {
            // разъеб
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }
}
