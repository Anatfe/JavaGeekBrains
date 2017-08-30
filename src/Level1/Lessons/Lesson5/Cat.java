package Level1.Lessons.Lesson5;

public class Cat {
    public String name; // отовсюду лучше не делать, через инкапсуляцию гетеры сетеры
    private String color; // для всех объектов одна переменная
    private int age; // обращение только внутри класса
    static int counter; // может работать во всех методах

    public Cat(Cat c){
        this.name = c.name;
        this.age  = 0;
        this.color = c.color;
        counter++;
    }

    public static int add(int a, int b){

        return a+b;

    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Cat(String name, String color, int age){
        this.name = name;
        this.color = color;
        this.age = age;
        counter ++;
    }

    public Cat(String name){
        this.name = name;
        this.color = color;
        this.age = age;
        counter ++;
    }

    public void  printInfo(){
        //counter++;
        System.out.println("Имя " + name + " цвет "+ color + " возраст "+ age);
    }

    public void jump(){
        System.out.println("Кот " + name + " подпрыгнул");
    }

}
