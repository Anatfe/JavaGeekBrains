package Level1.Lessons.Lesson5;

public class MainClass {
    public static void main(String[] args) {
        Singleton s  = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        System.out.println(s.getRnd());
        System.out.println(s2.getRnd());

        Cat[] cats = new Cat[5];
        for (int i = 0; i < cats.length; i++) {

        }
        System.gc(); // просьба java запустить мусорщика - но решеает сама java

//        Cat c1 = new Cat("Барсик", "Рыжый", 3);
//        Cat c2 = new Cat("Мурзик", "Белый", 5);
//        c1 = c2;
//        c2.setAge(28);
//        c1.printInfo();
//        c2.printInfo();
//
//        Cat c5 = null;
//        //c5.printInfo();


//        c1.setAge(4);
//        c1.printInfo();
//        c2.printInfo();
//        c1.jump();
//        c2.jump();
//
//        Cat c3 = new Cat("Мурка ", "Черная", 1);
//        //c3.color = "Зеленая";
//        c3.printInfo();
//        c1.printInfo();
//        System.out.println(Cat.counter);
//
//        System.out.println(Cat.add(1, 5));

    }
}
