package penguin.collections.lerning;
import penguin.collections.lerning.DictionaryUpdate;
//todo: hashmap - сделать "книгу имен", где в ключе будет лежать первая буква имени, а в значении СПИСОК всех имен, начинающихся на эту букву.
// Добавить в книгу 20 имен (желательно с разными первыми буквами)

import java.util.HashMap;
import java.util.Map;

// "Марина" "Мария" "Анастасия" "Денис" "Артемий" "Артём" "Кира" "Таисия" "Лев" "Тихон" "София" "Ульяна" "Адам" "Майя" "Варвара" "Нина" "Елизавета" "Михаил" "Ростислав" "Дмитрий"
public class HashMapDemo {
    public static void main(String[] args) {
        Map<Character, String> nameList = new HashMap<>();



        String[] namesArray = {"Марина" ,"Мария" ,"Анастасия" ,"Денис" ,"Артемий" ,"Кира" ,"Таисия" ,"Лев",
                "Тихон" ,"София" ,"Ульяна" ,"Адам" ,"Майя" ,"Варвара" ,"Нина" ,"Елизавета" ,"Михаил" ,"Ростислав" ,"Дмитрий" };

        nameList.updateValue(namesArray);
    }


}
