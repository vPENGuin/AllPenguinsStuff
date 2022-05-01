package penguin.collections.lerning;

import java.util.*;

public class DictionaryUpdate {
    private static void arrayHere(String[] namesArray) {
    }//кривой метод

    public static void updateValue(Map<Character, String> nameList, Character key, String value) {
        for (String elements: arrayHere()){
            if(nameList.containsKey(key)) {
                nameList.put(key, nameList.get(key) + value);
            } else {
                nameList.put(key, value);
            }
        }
    }
}
