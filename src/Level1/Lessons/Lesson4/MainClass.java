package Level1.Lessons.Lesson4;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by infuntis on 24/08/17.
 */
public class MainClass {
    static char[][] map;
    static Scanner scanner = new Scanner(System.in);
    static final char HUMAN_DOT = 'X';
    static final char AI_DOT = 'O';
    static  Random rnd = new Random();

    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if(checkWinX(HUMAN_DOT)){
                System.out.println("Вы победили");
                break;
            }
            if(isMapFull()){
                System.out.println("Ничья!");
                break;
            }
            aiTurn();
            printMap();
            if(checkWinX(AI_DOT)){
                System.out.println("Победил компьютер");
                break;
            }
            if(isMapFull()){
                System.out.println("Ничья!");
                break;
            }
        }
        System.out.println("Игра окончена");
    }

    public static boolean checkWinX(char dot){
        for (int i = 0; i < 3; i++) {
            if(checkLine(i,0,0,1,3,dot)){
                return true;
            }
            if(checkLine(0,i,1,0,3,dot)){
                return true;
            }
        }

        if (checkLine(0,0,1,1,3,dot)){
            return true;
        }
        if (checkLine(0,2,1,-1,3,dot)){
            return true;
        }
        return false;
    }

    /*
     cx - номер строки начальной точки
     cy - номер столбца начальной точки
     vx - направление движения по горизонтали (0 - нет движения 1 - двигаемя вправо)
     vy - направление движения по вертикали (0 - нет движения 1 - двигаемя вправо -1 - движение влево)
     l - длина искомой выигрышной последовательности (3)
     dot - искомый символ (крестик или нолик)
     */
    public static boolean checkLine(int cx, int cy, int vx, int vy, int l, char dot){
        for (int i = 0; i < l; i++) {
            if(map[cy + i*vy][cx + i*vx]!= dot){
                return false;
            }
        }
        return true;
    }

    public static boolean checkWin(char dot){
        if(map[0][0] == dot && map[0][1] == dot && map[0][2] == dot){
            return true;
        }
        if(map[1][0] == dot && map[1][1] == dot && map[1][2] == dot){
            return true;
        }
        if(map[2][0] == dot && map[2][1] == dot && map[2][2] == dot){
            return true;
        }

        if(map[0][0] == dot && map[1][0] == dot && map[2][0] == dot){
            return true;
        }
        if(map[0][1] == dot && map[1][1] == dot && map[2][1] == dot){
            return true;
        }
        if(map[0][2] == dot && map[1][2] == dot && map[2][2] == dot){
            return true;
        }

        if(map[0][0] == dot && map[1][1] == dot && map[2][2] == dot){
            return true;
        }
        if(map[2][0] == dot && map[1][1] == dot && map[0][2] == dot){
            return true;
        }

        return false;
    }

    public static boolean isMapFull(){
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                if(map[i][j] == '*'){
                    return false;
                }
            }
        }
        return true;
    }

    public static void aiTurn(){
        int x,y;
        do{
            x = rnd.nextInt(map.length);
            y = rnd.nextInt(map.length);
        }while(!isCellValid(x,y));
        map[y][x] = AI_DOT;
    }

    public static boolean isCellValid(int x, int y){
        if(x<0 || y < 0 || x>map.length-1 || y > map.length-1){
            return false;
        }
        if(map[y][x] == '*'){
            return true;
        }
        return false;
    }

    public static void humanTurn(){
        int x,y;
        do {
            System.out.println("Введите ячейку в формате x y");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        }while (!isCellValid(x,y));
        map[y][x] = HUMAN_DOT;

    }

    public static void printMap(){
        System.out.print("  ");
        for (int i = 1; i <= map.length ; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
        for (int i = 0; i < map.length; i++) {
            System.out.print(i+1+" ");
            for (int j = 0; j < map.length; j++) {
                System.out.print(map[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void initMap(){
        map = new char[3][3];
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                map[i][j] = '*';
            }
        }
    }

}
