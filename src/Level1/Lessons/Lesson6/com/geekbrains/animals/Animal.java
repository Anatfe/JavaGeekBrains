package Level1.Lessons.Lesson6.com.geekbrains.animals;

public abstract class Animal {
    protected String name;
    protected String color;
    protected int age;
    public static int value;

    public Animal(){
        this.name = "unknown";
        this.color = "unknown";
        this.age = 0;
    }

    public void jump(){
        System.out.println("Animal jumps");
    }

    public void jump(int d){
        System.out.println("Animal jumps on "+d+" meter");
    }

    @Override
    public String toString() {
        return "ФФФФФФФФФФФФФФФ";
    }

    public void printInfo(){
        System.out.println("Кличка: " + name + " окрас: " + color + " возраст: " + age);
    }

    public abstract void voice();

    public static int add(int a, int b){
        return a+b;
    }
}
