package Level1.Lessons.Lesson5;

import java.util.Random;

public class Singleton {
    private static int rnd;
    static Singleton instance;
    private Singleton(){
        rnd = new Random().nextInt(10000);
    }

    public int getRnd() {
        return rnd;
    }

    public static Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
