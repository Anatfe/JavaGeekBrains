package Level1.Tasks.Task7.pet;

import Level1.Tasks.Task7.utensil.Plate;

import java.util.ArrayList;

public class Cat {
    private String name;
    private int appetite;
    private boolean hungry;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.hungry = true;
    }

    public void eat(Plate plate) {
        if (appetite > plate.getFood()) {
            System.out.println("Коту: " + name + " не хватило еды! Аларм, кот голодный. Хотя отбой, я люблю собак!");
            hungry = true;
            return;
        }
        plate.decreaseFood(this);
        hungry = false;
    }

    public int getAppetite() {
        return appetite;
    }

    public static void printCatsInfo(ArrayList<Cat> arrCats) {
        for (Cat cat : arrCats) {
            System.out.println("Кот: " + cat.name +
                    ", аппетит: " + cat.appetite + ", " + cat.itHungryString());
        }
        System.out.println("---------------------------------");
    }

    public static void feedCats(ArrayList<Cat> arrCats, Plate plate) {
        for (Cat cat : arrCats) {
            if (!cat.hungry) continue;
            cat.eat(plate);
        }

    }

    public String itHungryString() {
        if (hungry) return "голодный";
        else return "сытый";
    }

    public static void expelFullCats(ArrayList<Cat> arrCats) {
        Cat cat;
        for (int i = 0; i < arrCats.size();) {
            cat = arrCats.get(i);
            if (cat.hungry) {
                i++;
                continue;
            }
            System.out.println("Выгоняем сытого кота: "+cat.name);
            arrCats.remove(i);
        }

    }
}
