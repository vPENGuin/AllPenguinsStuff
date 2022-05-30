import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        Map<Character, String> charRu = new HashMap<>();
        charRu.put('а', "a");
        charRu.put('б', "b");
        charRu.put('в', "v");
        charRu.put('г', "g");
        charRu.put('д', "d");
        charRu.put('е', "e");
        charRu.put('ё', "e");
        charRu.put('ж', "j");
        charRu.put('з', "z");
        charRu.put('и', "i");
        charRu.put('й', "i");
        charRu.put('к', "k");
        charRu.put('л', "l");
        charRu.put('м', "m");
        charRu.put('н', "n");
        charRu.put('о', "o");
        charRu.put('п', "p");
        charRu.put('р', "r");
        charRu.put('с', "s");
        charRu.put('т', "t");
        charRu.put('у', "u");
        charRu.put('ф', "f");
        charRu.put('х', "h");
        charRu.put('ц', "ts");
        charRu.put('ч', "ch");
        charRu.put('ш', "sh");
        charRu.put('щ', "sh");
        charRu.put('ъ', "");
        charRu.put('ы', "y");
        charRu.put('ь', "b");
        charRu.put('э', "e");
        charRu.put('ю', "u");
        charRu.put('я', "ya");

        Path path = Paths.get(
"C:\\Users\\vp3ru\\OneDrive\\Documents\\JavaHuava\\AllPenguinsStuff\\text-transliter\\src\\main\\resources\\readhere");

        String read = String.join("\n", Files.readAllLines(path));

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < read.length(); i++) {
            char ruChar = read.charAt(i);
            String latinText = charRu.get(Character.toLowerCase(ruChar));
            if (latinText == null){
                latinText = ruChar + "";
            }
            if (Character.isUpperCase(ruChar)){
                latinText = latinText.toUpperCase();
            }
            stringBuilder.append(latinText);
        }

        Path outputPath = Paths.get(
                "C:\\Users\\vp3ru\\OneDrive\\Documents\\JavaHuava\\AllPenguinsStuff\\text-transliter\\src\\main\\resources\\writehere");

        Files.writeString(outputPath, stringBuilder);
    }
}
