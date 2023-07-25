package src.java;

import java.util.Scanner;

public class Menu {
    static final String paragraph4 = " ==== ";
    public static void main(String[]args){
        System.out.println("Привіт, будемо грати з тобою у шибеницю! \n");
        userChoice();
    }
    private static int userChoice(){
        Scanner scanner = new Scanner(System.in);
        int input;

        do {
            System.out.println("Введіть:");
            System.out.println("1 - почати нову гру");
            System.out.println("2 - переглянути правила гри");
            System.out.println("0 - вийти");

            String userInput = scanner.nextLine().trim();

            if (userInput.matches("[012]")) {
                input = Integer.parseInt(userInput);

                switch (input) {
                    case 1:
                        System.out.println("Почнемо нову гру!");
                        // Тут можна додати код для початку гри
                        break;
                    case 2:
                        System.out.println(paragraph4 + "Правила гри" + paragraph4);
                        System.out.println("«Кат» або «Шибениця» – гра на двох і більше учасників, де потрібно \n" +
                                "вгадувати слово, загадане одним з гравців. Найчастіше як слова \n" +
                                "використовуються іменники в однині. На папері малюють квадратики \n" +
                                "або лінії під кожну літеру, можуть позначатися перша і остання букви. " +
                                "Решту потрібно вгадати.");
                        break;
                    case 0:
                        System.out.println("Ви вийшли з програми.");
                        break;
                }
            } else {
                System.out.println("Некоректний ввід. Будь ласка, введіть 1, 2 або 0:");
                input = -1; // Встановлюємо некоректне значення, щоб повторити цикл
            }
        } while (input != 0);

        scanner.close();
        return input;
    }
}
