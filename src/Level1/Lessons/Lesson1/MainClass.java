package Level1.Lessons.Lesson1;

public class MainClass {
    public static void main(String[] args) {
        ////////////////////////////////////////////////////////////////////
        /** 8 примитивных данных лежат в стеке:
         byte // 8 bits от -128 до 127
         short // 16 bits  -2^15 .. 2^15-1
         int // 32 bits -2^31 .. 2^31-1
         long // 64 bits -2^63 .. 2^63-1
         // 1 bytes под 0, считается положительным числом
         */

        byte a1;
        short a2;
        int a3;
        long a4;

        a1 = 127;
        a1++;
        System.out.println(a1);

        a3 = 20 / 11;
        System.out.println(a3);

        //

        float b1; // 32 bits
        double b2; // 64 bits

        b1 = 23.0000000000089f; //ставим признак флоат, иначе падает на ошибку
        b2 = 23.0000000000089;

        System.out.println(b1);
        System.out.println(b2);

        //

        char c = 'q'; // 16-bits, один символ в одинарных ковычках
        boolean b5 = true; // 32 - bits, обычно, зависит от java machine

        int a = 1;
        a++; // +1
        a--; // -1
        a += 5; // a = a+5;
        a -= 5; // a = a-5;
        a *= 3; // a = a*3
        a /= 3; // a = a/3
        a = 10;
        a = a % 9; // остаток от деления
        System.out.println(a);

        String q11 = "Zzzzzz";
        System.out.println(q11);

        /////////////////////////////////////////////////////////////////
        /** Не примитивные переменные, лежат в куче HEAP
         * String, объекты и прочее
         */

//        doSomething(666);
//        int resault = add(601, 65);
//        System.out.println(resault);
//
//        int s = mulBy2(3);
//        System.out.println(s);
//
//        System.out.println(mulBy3(8));

        int a11=5;
        int b=4;

        if(a11 !=5 || (a11==5 && b ==4)){
            System.out.println(true);
        }
//          if (a11 > 5) {
//              b++;
//          } else {
//              b--;
//          }
//          System.out.println(b);

        boolean q = true;
        if (q) System.out.println(true); // плохой стиль :)
    }

    // void не возвращаемая функциция
    public static void doSomething(int a){
        System.out.println("do "+a);
    }

    public static int add(int a, int b) {
        return a+b;
    }

    public static int mulBy2(int a) {
        return a*2;
    }

    public static String mulBy3(int a) {
        return "a*2 = "+(a*2);
    }
}
