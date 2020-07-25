package Lesson3;

import java.util.Random;
import java.util.Scanner;

public class HomeWork3 {

    public static void main(String[] args) {
        playGame();

    }

    public static void playGame() {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        do {
            int targetValue = random.nextInt(10);
            System.out.println("Загадано число от 0 до 9. Угадайте его с 3 попыток!");
            System.out.println("Введите число от 0 до 9:");
            for (int i = 0; i < 3; i++) {
                int userValue = scan.nextInt();
                if (targetValue < userValue) {
                    System.out.println("Не угадали. Ваше число больше загаданного.");
                } else if  (targetValue != userValue) {
                    System.out.println("Не угадали. Ваше число меньше загаданного.");
                }
                else {
                    System.out.print("Вы угадали!");
                    break;
                }
            }
            System.out.printf("Загаданное число: %d.%n", targetValue);
            System.out.println("Повторить игру? да - 1, нет - 0");
        } while (scan.nextInt() == 1);
    }
}
