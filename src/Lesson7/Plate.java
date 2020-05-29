package Lesson7;

public class Plate {

    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void printInfo() {
        System.out.println("Еды на тарелке = " + food);
    }

    public int getFood() {
        return food;
    }

    public void addFood(int foodCount) {
        this.food += foodCount;
    }

    public void decreaseFood(int foodCount) {
        this.food -= foodCount;
    }

    public boolean isFoodEnough(int foodCount) {
        return getFood() >= foodCount;
    }
}
