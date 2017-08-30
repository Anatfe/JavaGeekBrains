package Level1.Tasks.Task5;

public class Person {
    private String name;
    private String post;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Person(String name, String post, String email, String phone, int salary, int age) {
        this.name = name;
        this.post = post;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void printInfo(){
        System.out.println("name " + name + " post " + post +
                " email " + email + " phone  " + phone +
                " salary " + salary +" age " + age);
    }

    public int getAge() {
        return age;
    }
}
