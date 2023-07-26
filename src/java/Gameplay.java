package src.java;

import java.util.Arrays;
import java.util.Scanner;

public class Gameplay {
    private static String secretWord;
    private static char [] letterArray;
    private static char [] hiddenLetterArray;
    private final static int maxAttempts = 6;
    private static int attempts;

    public Gameplay(){
        secretWord = WordGenerator.getWord();
        letterArray = secretWord.toCharArray();
        attempts = 0;
        genereteHiddenLetterArray();
    }
    public static void start(){
        System.out.println("Гра розпочата, слово загадане! Його довжина : " + secretWord.length());

        while (attempts < maxAttempts){
            System.out.print("Уведіть букву : ");
            char input = Character.toLowerCase(getUserInput());

            if (secretWord.contains(String.valueOf(input))){
                System.out.println("Ви вгадали букву. Лічильник помилок : " + attempts);
                Gallows.drawGallows(attempts);
                drowingHiddenLetterArray(input);
            } else {
                System.out.println("Ви не вгадали букву. Лічильник помилок : " + (++attempts));
                Gallows.drawGallows(attempts);
                System.out.println(Arrays.toString(hiddenLetterArray));
                if (attempts == 6){
                    System.out.println("Ви програли! :(");
                    System.out.println("Ось яке було загадане слово : " + secretWord);
                }
            }
            if (checkWin()){
                System.out.println("Ви виграли!");
            }

        }
    }
    private static void genereteHiddenLetterArray(){
        hiddenLetterArray = new char[secretWord.length()];
        Arrays.fill(hiddenLetterArray, '_');
        System.out.println(Arrays.toString(hiddenLetterArray));
    }
    private static void drowingHiddenLetterArray(char letter){
        for (int i = 0; i < letterArray.length; i++){
            if (letterArray[i] == letter){
                hiddenLetterArray[i] = letter;
            }
        }
        System.out.println(Arrays.toString(hiddenLetterArray));
    }
    private static boolean checkWin(){
        for (char c : hiddenLetterArray) {
            if (c == '_') return false;
        }
        return true;
    }
    private static char getUserInput() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().trim();
        while (input.length() != 1 || !Character.isLetter(input.charAt(0))) {
            System.out.println("Некоректний ввід. Введіть одну букву:");
            input = scanner.nextLine().trim();
        }
        return input.charAt(0);
    }


}
