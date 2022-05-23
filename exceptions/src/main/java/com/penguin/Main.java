package com.penguin;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
//        String string = null;
//        string.toString(); все пошло по пизде, потому что string == null
        // пошло пизде ----> метод создал исключение new NullPointedException()

        double divide = divide(5, 0);
        writeToFileThrows("asdasd");
    }

    public static double divide(int a, int b) {
/*        if (b == 0) {
            throw new IllegalStateException("Бля, 2 аргумент 0, давай мне дай не 0");
        }*/
        return (double) a / b;
    }

    public static void writeToFile(String path) {
        // путь неверное указан, файлика может не быть в этом месте?
        try {
            Files.write(Paths.get(path), "asdasdasa".getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            // поймал ошибку, что с ней делать?
            // может быть путь неправильный
            // файл пустой
            // ....

            System.out.println("Что-то пошло по пизде:" + e);
        }
        // java.io.IOException

        // Если тебе прилетело в ебало исключение:
            // 1. Ты знаешь что с ним делать, ты ловишь ее try catch, и правишь
            // 2. Если ты не знаешь, что случилось и как это исправить, то пробрасываешь выше
    }

    public static void writeToFileThrows(String path) {
        // путь неверное указан, файлика может не быть в этом месте?
        try {
            Files.write(Paths.get(path), "asdasdasa".getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
