package Level1.Tasks.Task7.utensil;

import Level1.Tasks.Task7.pet.Cat;

public class Plate {
    private int food;
    private int maxFood;

    public Plate(int food) {
        this.food    = food;
        this.maxFood = food;
    }

    public int getFood() {
        return food;
    }

    public void addFood(int food) {
        if (maxFood > this.food + food){
            this.food = maxFood;
        } else this.food += food;
    }

    public void decreaseFood(Cat cat) {
        food -= cat.getAppetite();
    }

}
