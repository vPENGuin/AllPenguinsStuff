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
        sentence = removeWord(sentence, spam);
        System.out.println("4. " + sentence);

        sentence = symbolToUpperCase(sentence, 0);
        System.out.println("5. " + sentence);

        sentence = placeDot(sentence);
        System.out.println("6. " + sentence);

        sentence = placeComma(sentence);
        System.out.println("7. " + sentence);

        String parser = "парсер";
        findWord(sentence, parser);
    }

    private static void findWord(String sentence, String word) {
        int wordIndex = sentence.indexOf(word);
        if (wordIndex >= 0) {
            System.out.println("8. Предложение содержит слово " + word + " на " + wordIndex + " индексе");
        } else {
            System.out.println("8. Предложение не содержит слово " + word);
        }
    }

    private static String placeComma(String sentence) {
        int spaceIndex = sentence.indexOf(" ");
        if (spaceIndex > 0 && sentence.charAt(spaceIndex - 1) != ',' && sentence.charAt(spaceIndex + 1) != ','
                && sentence.split(" ").length > 1) {
            sentence = sentence.replaceFirst(" ", ", ");
        }
        return sentence;
    }

    private static String placeDot(String sentence) {
        char lastSymbol = sentence.charAt(sentence.length() - 1);
        if (lastSymbol != '.') {
            sentence = sentence + ".";
        }
        return sentence;
    }

    private static String symbolToUpperCase(String sentence, int index) {
        char symbol = sentence.charAt(index);
        if (Character.isLowerCase(symbol)) {
            char upSymbol = Character.toUpperCase(symbol);
            sentence = sentence.replaceFirst(symbol + "", upSymbol + "");
        }
        return sentence;
    }

    private static String removeWord(String sentence, String word) {
        return sentence.toLowerCase()
                .replaceAll(word, "")
                .replaceAll(" {2}", " ")
                .trim();
    }
}
