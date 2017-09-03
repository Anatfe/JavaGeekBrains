package Level1.Tasks.Task6;

import Level1.Tasks.Task6.com.geekbrains.animals.Animal;
import Level1.Tasks.Task6.com.geekbrains.animals.Home.Dog;
import Level1.Tasks.Task6.com.geekbrains.animals.Home.Cat;

public class MainClass {
    public static void main(String[] args) {
        Animal[] arrayAnimals = new Animal[4];
        arrayAnimals[0] = new Dog("Мухтар", "Немецкая овчарка", 2000, 1000, 1f);
        arrayAnimals[1] = new Dog("Шарик", "Лайка", 1000, 500, 0.8f);
        arrayAnimals[2] = new Cat("Васька", "Беспородный", 1100, 2f);
        arrayAnimals[3] = new Cat("Принцесса", "Сиамская", 600, 1.3f);

        for (Animal animals :arrayAnimals) {
            animals.printInfo();
            System.out.println("Животное сможет пробежать 1 км: " + animals.checkRun(1000));
            System.out.println("Животное сможет проплыть 800 м: " + animals.checkSwimming(800));
            System.out.println("Животное сможет подпрыгнуть 0.9 м: " + animals.checkJump(0.9f));
            System.out.println("-------------------------------------");
        }

    }
}
