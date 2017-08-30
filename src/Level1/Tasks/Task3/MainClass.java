package Level1.Task.Task3;

import java.util.Random;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {

        task1();
        task2();
    }

    public static void task2() {
        String[] wordsArray = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        Random rand = new Random();
        String wordRand = wordsArray[rand.nextInt( wordsArray.length)];
        System.out.println(wordRand);

        Scanner sc = new Scanner(System.in);
        String word, letter1, letter2;

        do {
            System.out.println("Введите фрукт ");
            word = sc.nextLine().toLowerCase();
            if (word.equals(wordRand) != true) {
                System.out.println("Вы угадали буквы: ");
                for (int i = 0; i < wordRand.length() && i < word.length(); i++) {

                    if (word.charAt(i) == wordRand.charAt(i)) {
                        System.out.print(word.charAt(i));
                    } else System.out.print("#");
                }
                System.out.print("##########");
                System.out.println();
            }
        } while (word.equals(wordRand) != true);

        System.out.println("Вы угадали фрукт");
    }

    public static void task1(){
        Scanner sc = new Scanner(System.in);
        int a = 0;
        do {
            methodGuessNumber();
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
            a = sc.nextInt();
        } while (a == 1);
    }

    public static void methodGuessNumber(){
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int x = rand.nextInt(10);
        int a;
        for (int i = 3; i > 0; i--) {
            System.out.println("Осталось попыток: " + i + ", введите число от 0 до 9");
            a = sc.nextInt();
            if (a==x) {
                System.out.println("Вы угадали с "+(4-i)+" попытки!");
                break;
            } else if (a >= x) {
                System.out.println("Загаданное число меньше чем "+a);
            } else System.out.println("Загаданное число больше чем "+a);
        }
    }
}
