package Lesson6;

public class Cat extends Animal {

    public static final double DEFAULT_MAX_RUN_DISTANCE = 200;
    public static final double DEFAULT_MAX_SWIM_DISTANCE = 0;
    public static final double DEFAULT_MAX_JUMP_HEIGHT = 2;

    public Cat(String name, double maxRunDistance, double maxJumpHeight) {
        super(name, maxRunDistance, DEFAULT_MAX_SWIM_DISTANCE, maxJumpHeight);
    }

    public Cat(String name) {
        super(name, DEFAULT_MAX_RUN_DISTANCE, DEFAULT_MAX_SWIM_DISTANCE, DEFAULT_MAX_JUMP_HEIGHT);
    }

    @Override
    public boolean run(double distance) {
        if (this.maxRunDistance >= distance) {
            System.out.printf("Кот пробежал %.1f метров. А мог пробежать %.1f :)%n", distance, maxRunDistance);
            return true;
        }

        System.out.printf("Кот не смог пробежать дистанцию %.1f метров. Его хватило только на %.1f :(%n", distance, maxRunDistance);
        return false;
    }

    @Override
    public boolean swim(double distance) {
        System.out.println("Коты не умеют плавать!!!");
        return false;
    }

    @Override
    public boolean jump(double height) {
        if (this.maxJumpHeight >= height) {
            System.out.printf("Кот перепрыгнул стену высотой %.1f метров. А мог перепрыгнуть %.1f :)%n", height, maxJumpHeight);
            return true;
        }

        System.out.printf("Кот не смог перепрыгнуть стену высотой %.1f метров. Смог допрыгнуть только до %.1f :(%n", height, maxJumpHeight);
        return false;
    }

    @Override
    public void printInfo() {
        System.out.printf("%s (Может пробежать %.1f метров и прыгнуть на %.1f метра)%n",
                name, maxRunDistance, maxJumpHeight);
    }
}
