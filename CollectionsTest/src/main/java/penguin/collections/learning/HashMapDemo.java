package penguin.collections.learning;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<Character, Set<String>> bookOfNames = new HashMap<>();

        String[] namesArray = {"Марина", "мария", "Мария", "Анастасия", "Денис", "Артемий", "Кира", "Таисия", "Лев",
                "Тихон", "София", "Ульяна", "Адам", "Майя", "Варвара", "Нина", "мария", "Елизавета", "Михаил", "Ростислав",
                "Дмитрий", "Дмитрий", "Мария"};

        for (String name : namesArray) {
            Character firstLetter = name.toUpperCase().charAt(0);
            if (!bookOfNames.containsKey(firstLetter)) {
                Set<String> value = new HashSet<>();
                value.add(name);
                bookOfNames.put(firstLetter, value);
            } else {
                Set<String> value = bookOfNames.get(firstLetter);
                value.add(name);
            }
        }
        System.out.println(bookOfNames);
    }
}
