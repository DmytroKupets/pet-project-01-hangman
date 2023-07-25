package src.java;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;

public class WordGenerator {
    public static String getWord() {
        List<String> wordList = null;

        try {
            wordList = Files.readAllLines(Paths.get("src/resources/dictionary.txt"));
        } catch (IOException e) {
            System.out.println("Помилка читання файлу: " + e.getMessage());
        }

        return wordList.get(new Random().nextInt(wordList.size()));
    }
}
