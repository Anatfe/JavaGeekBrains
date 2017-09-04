package Level1.Lessons.Lesson7;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;


public class MainClass {
    public static void main(String[] args) {
        try {
            /*
            FileOutputStream fos = new FileOutputStream("1.txt", true);
            String a = "Hello";
            fos.write(a.getBytes());
            fos.flush(); // помещает из буфера в память
            fos.close();

            PrintWriter pw = new PrintWriter(new FileOutputStream("2.txt", true), true);
            pw.println("dsjlkgklsdfgjklsdfgkljsdgf");
            pw.print("sfd");
            pw.close();
            */
            FileInputStream fis = new FileInputStream("1.txt");
            int i = -1;
            do {
                i = fis.read();
                if (i != -1){
                    System.out.print((char)i);
                }
            }while (i!=-1);

        } catch (java.io.IOException e) {
            e.printStackTrace();
        }




//        Cat c = new Cat("Барсик", 20);
//        Plate p = new Plate(80);
//        p.info();
//        c.eat(p);
//        p.info();


       // long t = System.currentTimeMillis();
//        String a = "Hello";
//        for (int i = 0; i < 120000; i++) {
//            a +=1;
//        }
        /*
        StringBuilder a = new StringBuilder("Hello");
        for (int i = 0; i < 120000; i++) {
            a.append(1);
        }
        System.out.println(System.currentTimeMillis() - t);
        */

//        char[] carr = {'J','a','v','a'};
//        String java = new String(carr);
//        System.out.println(java);

//        //a += 1;
//        //System.out.println(a);
//        String b = "Hello";
//        if (a == b) System.out.println("true1");
//        b +=1;
//        if (a == b) System.out.println("true2");
//        b = b.substring(0, b.length()-1);
//        System.out.println(b);
//        if (a == b) System.out.println("true3");
//        if (b.equals(a)) System.out.println("true4");
//        char[] aa = b.toCharArray();
//        System.out.println(aa.length);

    }
}
