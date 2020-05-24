package Lesson6;

import java.util.Random;

public class HomeWork6 {
    public static void main(String[] args) {
        Animal[] pets = initPets();
        playWithPets(pets);
    }

    private static Animal[] initPets() {
        return new Animal[]{
                new Cat("Cat1"),
                new Dog("Dog1"),
                new Cat("Cat2", 300, 3),
                new Dog("Dog2", 400, 15, 1),
                new Dog("Dog3", 600, 20, 1.5),
        };
    }

    private static void playWithPets(Animal[] pets) {
        Random random = new Random();

        for (Animal pet : pets) {
            pet.printInfo();
            System.out.println(pet.run((random.nextDouble() + 0.3) * pet.maxRunDistance));
            System.out.println(pet.swim((random.nextDouble() + 0.3) * pet.maxSwimDistance));
            System.out.println(pet.jump((random.nextDouble() + 0.3) * pet.maxJumpHeight));
            System.out.println();
        }
    }


}
