package Lesson5;

import java.util.Random;

public class HomeWork5 {
    private static final int WORKER_COUNT = 5;
    private static final int MIN_AGE = 40;
    static Random Random = new Random();

    public static void main(String[] args) {
        Worker[] workers = new Worker[WORKER_COUNT];

        System.out.println("Полный список сотрудников:");
        for (int i = 0; i < WORKER_COUNT; i++) {
            workers[i] = createWorker(i);
            workers[i].printInfo();
        }

        System.out.println("Список сотрудников старше 40 лет:");
        for (Worker worker : workers) {
            if (worker.getAge() > MIN_AGE) {
                worker.printInfo();
            }
        }
    }

    private static Worker createWorker(int i) {
        return new Worker(
                "lastName" + i,
                "firstName" + i,
                "middleName" + i,
                Random.nextInt(30) + 30,
                "name" + i + ".lastName" + i + "@java.test",
                "+7 (910) 777-88-9" + i,
                "Tester",
                Random.nextInt(60) * 1000);
    }
}
