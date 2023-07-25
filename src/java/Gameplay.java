package src.java;

import java.util.Arrays;

public class Gameplay {
    private static String secretWord;
    private static char [] letterArray;
    private static char [] hiddenLetterArray;
    private final static int maxAttempts = 6;
    private static int attempts = 0;
    private static int counter = 0;

    public static void start(){
        secretWord = WordGenerator.getWord();
        letterArray = secretWord.toCharArray();
        System.out.println("Гра розпочата, слово загадане! Його довжина : " + secretWord.length());
        genereteHiddenLetterArray();
        while (attempts < maxAttempts){

            System.out.print("Уведіть букву : ");
            char input = Character.toLowerCase(Gallows.getUserInput());

            if (secretWord.contains(String.valueOf(input))){
                System.out.println("Ви вгадали букву. Лічильник помилок : " + counter);
                Gallows.drawGallows(attempts);
                drowingHiddenLetterArray(input);
            } else {
                counter++;
                System.out.println("Ви не вгадали букву :(. Лічильник помилок : " + counter);
                Gallows.drawGallows(++attempts);
                System.out.println(Arrays.toString(hiddenLetterArray));
            }
            if (checkWin()){
                System.out.println("Ви виграли!");
            }
        }
        if (attempts == maxAttempts){
            attempts = 0;
            counter = 0;
            System.out.println("Ви програли :()");
            Menu.userChoice();
        }
    }
    private static void genereteHiddenLetterArray(){
        hiddenLetterArray = new char[secretWord.length()];
        for (int i = 0; i < hiddenLetterArray.length; i++){
            hiddenLetterArray [i] = '_';
        }
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
        for (int i = 0; i < hiddenLetterArray.length; i++){
            if (hiddenLetterArray[i] == '_') return false;
        }
        return true;
    }


}
