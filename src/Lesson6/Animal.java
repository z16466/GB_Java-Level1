package Lesson6;

public abstract class Animal {

    protected String name;
    protected double maxRunDistance;
    protected double maxSwimDistance;
    protected double maxJumpHeight;

    public Animal(String name, double maxRunDistance, double maxSwimDistance, double maxJumpHeight) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
        this.maxJumpHeight = maxJumpHeight;
    }

    public abstract boolean run(double distance);
    public abstract boolean swim(double distance);
    public abstract boolean jump(double height);

    public void printInfo() {
        System.out.printf("%s (Может пробежать %.1f метров, проплыть %.1f метров и прыгнуть на %.1f метра)%n",
                name, maxRunDistance, maxSwimDistance, maxJumpHeight);
    }
}
