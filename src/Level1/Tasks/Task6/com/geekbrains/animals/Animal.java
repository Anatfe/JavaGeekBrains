package Level1.Tasks.Task6.com.geekbrains.animals;

public abstract class Animal {
    protected String name;
    protected int limitRun;
    protected int limitSwimming;
    protected float limitJump;
    protected String breed;

    public Animal() {
        this.name = "unknown";
        this.breed = "unknown";
        this.limitRun = 0;
        this.limitSwimming = 0;
        this.limitJump = 0;
    }

    public void printInfo() {
        System.out.println("Кличка: " + name +
                " порода: " + breed +
                " limitRun: " + limitRun +
                " limitSwimming: " + limitSwimming +
                " limitJump: " + limitJump);
    }

    public boolean checkRun(int run) {
        return run < limitRun;
    }

    public boolean checkSwimming(int swimming) {
        return swimming < limitSwimming;
    }

    public boolean checkJump(float jump) {
        return jump < limitJump;
    }
}
