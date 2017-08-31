package Level1.Lessons.Lesson6;


import Level1.Lessons.Lesson6.com.geekbrains.animals.Animal;
import Level1.Lessons.Lesson6.com.geekbrains.animals.home.Cat;
import Level1.Lessons.Lesson6.com.geekbrains.animals.home.Cow;
import Level1.Lessons.Lesson6.com.geekbrains.animals.home.Dog;
import Level1.Lessons.Lesson6.com.geekbrains.animals.home.RocketCat;

public class MainClass {
    public static void main(String[] args) {

        Dog d = new Dog("Бобик", "черный", 5);
        Cat c = new Cat("Барсик", "рыжый", 1);
//        d.value = 45;
//        c.value = 58;
//        System.out.println(Animal.value);
//        d.printInfo();
//        c.printInfo();
        Cow cow = null;
        cow = new Cow();
        Animal a3 = new RocketCat();

        System.out.println(d);
//        cow.printInfo();

//        d.voice();
//        c.voice();
//        cow.voice();
//
//        d.jump(2);
        Animal[] animals = new Animal[4];
        animals[0] = d;
        animals[1] = c;
        animals[2] = a3;
        animals[3] = cow;

        for (Animal animal :animals) {
            animal.voice();
            if (animal instanceof RocketCat) ((RocketCat) animal).RocketJump();
        }


    }
}
