package Level1.Lessons.Lesson6.com.geekbrains.animals.home;
import Level1.Lessons.Lesson6.com.geekbrains.animals.Animal;

public class Dog extends Animal{
    public Dog(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    @Override
    public void voice() {
        System.out.println("Гав");;
    }

    @Override
    public void jump(int d) {
        super.jump();
        System.out.println("Dog jump");
    }
}

