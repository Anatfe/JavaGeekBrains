package Level1.Lessons.Lesson6.com.geekbrains.animals.home;

import Level1.Lessons.Lesson6.com.geekbrains.animals.Animal;

public class Cat extends Animal {

    public Cat(){

    };

    public Cat(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    @Override
    public void voice(){
        System.out.println("мяу");
    }

    @Override
    public void printInfo() {
        super.printInfo();
    }

}
