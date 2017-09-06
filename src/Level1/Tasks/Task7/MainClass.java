package Level1.Tasks.Task7;

import Level1.Tasks.Task7.pet.Cat;
import Level1.Tasks.Task7.utensil.Plate;

import java.util.ArrayList;

public class MainClass {

    public static void main(String[] args) {
        Plate plate = new Plate((int)(Math.random()*10)+10);
        System.out.println("Еды в тарелке: "+plate.getFood());

        ArrayList<Cat> arrCats = new ArrayList();
        initializationCat(5, arrCats);

        System.out.println("Состояние котов:");
        Cat.printCatsInfo(arrCats);

        Cat.feedCats(arrCats, plate);
        System.out.println("Состояние котов после кормежки:");
        Cat.printCatsInfo(arrCats);

        Cat.expelFullCats(arrCats);
        System.out.println("Оставшиеся коты:");
        Cat.printCatsInfo(arrCats);

        plate.addFood(10);
        System.out.println("Еды в тарелке: "+plate.getFood());


    }
    public static void initializationCat(int cats, ArrayList arrCats) {
        for (int i = 0; i < cats; i++) {
            arrCats.add(new Cat("Васька "+(i+1), (int)((Math.random()*10)+1)));
        }
    }

}
