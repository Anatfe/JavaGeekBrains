package Level1.Lessons.Lesson2;

import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {

        int[][] a = new int[3][];
        a[0] = new int[5];
        a[1] = new int[5000];
        a[2] = new int[3];

        for (int[] q: a){
            System.out.println(Arrays.toString(q));
        }


        /**
         int[][] a = new int[3][3];
         int k = 1;
         for (int i = 0; i < 3; i++) {
         for (int j = 0; j < 3; j++) {
         a[i][j] = k;
         k++;
         }
         }

         for (int i = 0; i < a.length; i++) {
         for (int j = 0; j < a[i].length; j++) {
         System.out.print();
         }
         }
         */


        //        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.print(a[i][j]+" ");
//            }
//            System.out.println();
//        }

        /**
         String [] sm = {"A", "B", "C"};
         for(String s : sm){
         System.out.println(s);
         }
         */

        /**
         //        создание массива
         int [] b = new int[5];
         b[2] = 7;
         for (int i = 0; i < b.length; i++) {
         //System.out.println(b[i]+" ");
         }

         int [] c = {7,8,9};
         System.out.println(Arrays.toString(c));
         c[2] = 20;
         System.out.println(Arrays.toString(c));
         */
        /**
         int x = 7;
         String s = "";
         for (int y = 0; y < 3 && x < 10; y++) {
         x++;
         // возвращает 8 9 10 9 10 10
         // принцип водопада, пока нет break попадает во все уровни switch
         switch (x) {
         case 8:
         s += "8 ";
         case 9:
         s += "9 ";
         case 10:
         s += "10 ";
         break;
         default:
         s += "d ";
         case 13:
         s += "13 ";
         }

         }
         System.out.println(s);

         }
         */

        /**
         for (int i = 0; i < 20; i+=4){
         System.out.print(" "+i);
         }
         */

        /**
         int a = 4;
         switch (a){
         case 5:
         System.out.println("a==5");
         break;
         case 4:
         System.out.println("a==4");
         break;
         case 3:
         System.out.println("a==3");
         break;
         default:
         System.out.println("default");
         }
         System.out.println("end");
         */

    }
}