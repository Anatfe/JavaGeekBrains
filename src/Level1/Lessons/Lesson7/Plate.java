package Level1.Lessons.Lesson7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int food){
        this.food -= food;
    }

    public void info(){
        System.out.println(food);
    }
}
