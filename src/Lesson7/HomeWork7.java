package Lesson7;

import java.util.Scanner;

public class HomeWork7 {

    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Cat 1", 6),
                new Cat("Cat 2", 7),
                new Cat("Cat 3", 8),
        };

        Plate plate = new Plate(20);

        printInfo(cats, plate);
        haveLunch(cats, plate);

        printInfo(cats, plate);

        addFood(plate);
        System.out.println("Теперь еды на тарелке: " + plate.getFood());
        System.out.println();

        haveLunch(cats, plate);
        printInfo(cats, plate);
    }

    private static void addFood(Plate plate) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Добавьте еды на тарелку: ");
        int foodCount = scanner.nextInt();
        plate.addFood(foodCount);
    }

    private static void printInfo(Cat[] cats, Plate plate) {
        plate.printInfo();
        printInfo(cats);
        System.out.println();
    }

    private static void haveLunch(Cat[] cats, Plate plate) {
        for (Cat cat : cats) {
            boolean result = cat.eat(plate);
            System.out.printf("Кот %s поест? %s%n", cat.getName(), result);
        }
        System.out.println();
    }

    private static void printInfo(Cat... cats) {
        for (Cat cat : cats) {
            System.out.printf("Кот %s (с аппетитом %d) голоден? %s%n",
                    cat.getName(),
                    cat.getAppetite(),
                    !cat.isFullness());
        }
    }
}
