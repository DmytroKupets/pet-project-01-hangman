package src.java;

import java.util.Scanner;

public class Menu {
    static final String paragraph4 = " ==== ";
    public static void main(String[]args) {
        System.out.println("Привіт, будемо грати у шибеницю!\n");
        userChoice();
    }
    private static void userChoice() {
        Scanner scanner = new Scanner(System.in);
        int input;
        do {
            System.out.println("1 - почати нову гру");
            System.out.println("2 - переглянути правила гри");
            System.out.println("0 - вийти");

            String userInput = scanner.nextLine().trim();


            if (userInput.matches("[012]")) {
                input = Integer.parseInt(userInput);

                switch (input) {
                    case 1 -> {
                        System.out.println("Почнемо нову гру!");
                        new Gameplay().start();
                    }
                    case 2 -> {
                        System.out.println(paragraph4 + "Правила гри" + paragraph4);
                        System.out.println("""
                                «Кат» або «Шибениця» – гра на двох і більше учасників, де потрібно\s
                                вгадувати слово, загадане одним з гравців. Найчастіше як слова\s
                                використовуються іменники в однині. На папері малюють квадратики\s
                                або лінії під кожну літеру, можуть позначатися перша і остання букви. Решту потрібно вгадати.""");
                    }
                    case 0 -> System.out.println("Ви вийшли з програми.");
                }
            } else {
                System.out.println("Некоректний ввід. Будь ласка, введіть 1, 2 або 0:");
                input = -1; // Встановлюємо некоректне значення, щоб повторити цикл
            }
        } while (input != 0);
    }
}
