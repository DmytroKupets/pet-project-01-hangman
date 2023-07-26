package src.java;

public class Gallows {
    // Метод для виведення шибениці залежно від кількості помилок
    public static void drawGallows(int attempts) {
        switch (attempts) {
            case 1 -> {
                System.out.println("  _______");
                System.out.println("  |     |");
                System.out.println("  |     O");
                System.out.println("  |");
                System.out.println("  |");
                System.out.println("  |");
                System.out.println("__|__");
            }
            case 2 -> {
                System.out.println("  _______");
                System.out.println("  |     |");
                System.out.println("  |     O");
                System.out.println("  |     |");
                System.out.println("  |");
                System.out.println("  |");
                System.out.println("__|__");
            }
            case 3 -> {
                System.out.println("  _______");
                System.out.println("  |     |");
                System.out.println("  |     O");
                System.out.println("  |    /|");
                System.out.println("  |");
                System.out.println("  |");
                System.out.println("__|__");
            }
            case 4 -> {
                System.out.println("  _______");
                System.out.println("  |     |");
                System.out.println("  |     O");
                System.out.println("  |    /|\\");
                System.out.println("  |");
                System.out.println("  |");
                System.out.println("__|__");
            }
            case 5 -> {
                System.out.println("  _______");
                System.out.println("  |     |");
                System.out.println("  |     O");
                System.out.println("  |    /|\\");
                System.out.println("  |    /");
                System.out.println("  |");
                System.out.println("__|__");
            }
            case 6 -> {
                System.out.println("  _______");
                System.out.println("  |     |");
                System.out.println("  |     O");
                System.out.println("  |    /|\\");
                System.out.println("  |    / \\");
                System.out.println("  |");
                System.out.println("__|__");
            }
            default -> {
                System.out.println("  _______");
                System.out.println("  |");
                System.out.println("  |");
                System.out.println("  |");
                System.out.println("  |");
                System.out.println("  |");
                System.out.println("__|__");
            }
        }
    }
}
