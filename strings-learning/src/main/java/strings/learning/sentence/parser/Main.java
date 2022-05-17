package strings.learning.sentence.parser;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("1. Введите количество слов: ");
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println("Количество слов: [" + number + "]");

        String[] words = new String[number];

        System.out.println("2. Введите " + number + " слов(-а) :");
        for (int i = 0; i < number; i++) {
            words[i] = scanner.nextLine();
            System.out.println("[" + words[i] + "]");
        }

        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(word).append(" ");
        }
        String sentence = sb.toString().trim();
        System.out.println("3. Вывод текста: " + sentence);

        String spam = "спам";
        sentence = sentence.toLowerCase()
                .replaceAll(spam, "")
                .replaceAll(" {2}", " ")
                .trim();
        System.out.println("4. " + sentence);

        char firstSymbol = sentence.charAt(0);
        if (Character.isLowerCase(firstSymbol)) {
            char upLetter = Character.toUpperCase(firstSymbol);
            sentence = sentence.replaceFirst(firstSymbol + "", upLetter + "");
            System.out.println("5. " + sentence);
        }

        char lastSymbol = sentence.charAt(sentence.length() - 1);
        if (lastSymbol != '.') {
            sentence = sentence + ".";
            System.out.println("6. " + sentence);
        }

        int index = sentence.indexOf(" ");
        if (index > 0 && sentence.charAt(index - 1) != ',' && sentence.charAt(index + 1) != ','
                && sentence.split(" ").length > 1) {
            sentence = sentence.replaceFirst(" ", ", ");
            System.out.println("7. " + sentence);
        }

        int parserIndex = sentence.indexOf("парсер");
        if (parserIndex >= 0) {
            System.out.println("8. Предложение содержит слово парсер на " + parserIndex + " индексе");
        } else {
            System.out.println("8. Предложение не содержит слово парсер");
        }
    }
}
