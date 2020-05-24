package Lesson6;

public class Dog extends Animal {

    public static final double DEFAULT_MAX_RUN_DISTANCE = 500;
    public static final double DEFAULT_MAX_SWIM_DISTANCE = 10;
    public static final double DEFAULT_MAX_JUMP_HEIGHT = 0.5;

    public Dog(String name, double maxRunDistance, double maxSwimDistance, double maxJumpHeight) {
        super(name, maxRunDistance, maxSwimDistance, maxJumpHeight);
    }

    public Dog(String name) {
        super(name, DEFAULT_MAX_RUN_DISTANCE, DEFAULT_MAX_SWIM_DISTANCE, DEFAULT_MAX_JUMP_HEIGHT);
    }

    @Override
    public boolean run(double distance) {
        if (this.maxRunDistance >= distance) {
            System.out.printf("Собака пробежала %.1f метров. А могла пробежать %.1f :)%n", distance, maxRunDistance);
            return true;
        }

        System.out.printf("Собака не смогла пробежать дистанцию %.1f метров. Её хватило только на %.1f :(%n", distance, maxRunDistance);
        return false;
    }

    @Override
    public boolean swim(double distance) {
        if (this.maxSwimDistance >= distance) {
            System.out.printf("Собака проплыла %.1f метров. А могла проплыть %.1f :)%n", distance, maxSwimDistance);
            return true;
        }

        System.out.printf("Собака не смогла проплыть %.1f метров. Её хватило только на %.1f :(%n", distance, maxSwimDistance);
        return false;
    }

    @Override
    public boolean jump(double height) {
        if (this.maxJumpHeight >= height) {
            System.out.printf("Собака перепрыгнула стену высотой %.1f метров. А могла перепрыгнуть %.1f :)%n", height, maxJumpHeight);
            return true;
        }

        System.out.printf("Собака не смогла перепрыгнуть стену высотой %.1f метров. Смогла допрыгнуть только до %.1f :(%n", height, maxJumpHeight);
        return false;
    }
}
