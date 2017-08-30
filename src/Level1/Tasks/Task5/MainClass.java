package Level1.Tasks.Task5;

public class MainClass {
    public static void main(String[] args) {
        createStaffs();
    }
    public static void createStaffs(){

        Person[] arrPersons = new Person[5];

        for (int i = 0; i < arrPersons.length; i++) {
            arrPersons[i] = new Person("Person" + (i + 1), "Programmist", "ttt@rty.net", "93321245660", i * 100, i * 10);
        }

        for (Person p :arrPersons) {
            if (p.getAge() >= 40){
                p.printInfo();
            }
        }


    }
}
