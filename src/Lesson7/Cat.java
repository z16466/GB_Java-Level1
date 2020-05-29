package Lesson7;

public class Cat {

    private final String name;
    private int appetite;
    private boolean fullness;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public boolean eat(Plate plate) {
        String foodMessage = checkEat(plate);
        if (foodMessage != null) {
            System.out.println(foodMessage);
            return false;
        }

        doEat(plate);
        fullness = true;
        return true;
    }

    private String checkEat(Plate plate) {
        if ( !plate.isFoodEnough(appetite) ) {
            return "На тарелке мало еды!";
        }
        if (fullness) {
            return "Кот уже наелся!";
        }

        return null;
    }

    private void doEat(Plate plate) {
        plate.decreaseFood(appetite);
    }

    public boolean isFullness() {
        return fullness;
    }
}
