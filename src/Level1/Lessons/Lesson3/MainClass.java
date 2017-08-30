package Level1.Lessons.Lesson3;

import java.util.Arrays;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Введите первое число ");
//        int a = sc.nextInt();
//        System.out.println("Введите второе число ");
//        int b = sc.nextInt();
//        System.out.println("a + b = "+(a+b));

//        System.out.println("Введите строку ");
//        String str = sc.next();
//        System.out.println("str = "+str);

//         muiltBy2();

        //printArray(new int[]{1,2,3,4,5,6});

        //printArray2(new int[]{1,2,3,4,5,6});

        //print2DDArray(new int[][]{{1,2,3,4,5,6},{6,5,4}});

        //print2DDArray2(new int[][]{{1,2,3,4,5,6},{6,5,4}});

        //arrSum(new int[]{1,2,3,4,5,6});

//        Random rand = new Random();
//        int x = rand.nextInt(201)-100; // от -100 до 100 вернет
//        System.out.println(x);
//        format();

        // сравнение строк
        String str1 = "A";
        String str2 = "B";
        String str3 = "";
        System.out.println(str1.equals(str2));
        System.out.println(str3.isEmpty());
    }

    public static void format() {
        System.out.printf("Слово: %s, Число с плавающей точкой: %.2f, целое число: %d, символ%c","Java", 45.569f, 45, 's');
    }

    public static void print2DDArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void arrSum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum +=array[i];
        }
        System.out.println("sum = "+sum);
    }

    public static void print2DDArray2(int[][] array) {
        for (int[] i: array
                ) {
            System.out.println(Arrays.toString(i));
        }
    }

    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }

    public static void printArray2(int[] array){
        System.out.println(Arrays.toString(array));
    }

    public static void muiltBy2() {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        System.out.println("Введите целое число ");
        if (sc.hasNextInt()){
            i = sc.nextInt();
            System.out.println(i*2);
        } else {
            System.out.println("Вы ввели не целое число");
        }

    }
}
