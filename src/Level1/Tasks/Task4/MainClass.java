package Level1.Task.Task4;
import java.util.Random;
import java.util.Scanner;

public class MainClass {
    static char[][] map;
    static Scanner scanner = new Scanner(System.in);
    static final char HUMAN_DOT = 'X';
    static final char AI_DOT = 'O';
    static Random rnd = new Random();

    public static void main(String[] args) {
        gameTicTacToe(5, 4);
    }

    public static void gameTicTacToe(int cages, int inrow) {
        // инициализируем карту
        initMap(cages);
        printMap();

        int[] turnXY = new int[2];


        while (true) {
            turnXY = humanTurn();
            if (checkWinX(HUMAN_DOT, turnXY, inrow)) {
                System.out.println("Вы победили!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья!");
                break;
            }

            /*
            turnXY = aiTurn();
            if (checkWinX(AI_DOT, turnXY, inrow)) {
                System.out.println("Компьютер победил!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья!");
                break;
            }
            */
        }
    }

    /*
     cx - номер строки начальной точки
     cy - номер столбца начальной точки
     vx - направление движения по горизонтали (0 - нет движения 1 - двигаемя вправо)
     vy - направление движения по вертикали (0 - нет движения 1 - двигаемя вправо -1 - движение влево)
     l - длина искомой выигрышной последовательности (3)
     dot - искомый символ (крестик или нолик)
     */

    public static boolean checkWinX(char dot, int[] turnXY, int inrow) {
        int min, max;
        // ищем по горизонтали х влево
        min = findDot(dot, turnXY[0], turnXY[0], turnXY[1], -1, 0, -1);
        // ищем по горизонтали x вправо
        max = findDot(dot, turnXY[0], turnXY[0], turnXY[1], 1, 0, 1);
        if (max - min == inrow - 1) {
            return true;
        }
        // ищем по вертикали вверх
        min = findDot(dot, turnXY[1], turnXY[0], turnXY[1], 0, -1, -1);
        // ищем по вертикали взиз
        max = findDot(dot, turnXY[1], turnXY[0], turnXY[1], 0, 1, 1);
        if (max - min == inrow - 1) {
            return true;
        }

        // диагональ left -> Right
        // ищем по диаганали влево вверх
        min = findDot(dot, turnXY[0], turnXY[0], turnXY[1], -1, -1, -1);
        // ищем по диаганали вправо вниз
        max = findDot(dot, turnXY[0], turnXY[0], turnXY[1], 1, 1, 1);
        if (max - min>= inrow - 1) {
            return true;
        }
        // ищем по диаганали вправо вверх
        min = findDot(dot, turnXY[0], turnXY[0], turnXY[1], 1, -1, -1);
        // ищем по диаганали влево вниз
        max = findDot(dot, turnXY[0], turnXY[0], turnXY[1], -1, 1, 1);
        if (max - min >= inrow - 1) {
            return true;
        }

        return false;
    }

    public static int findDot(char dot, int i, int x, int y, int vx, int vy, int ic) {
        int j = 1;
        while (true) {
            i += ic;
            if (y + j * vy < 0 || y + j * vy > map.length - 1 || x + j * vx < 0 || x + j * vx> map.length - 1 || map[y + j * vy][x + j * vx] != dot) {
                break;
            }

            j++;
        }

        return i - ic; // надо убрать както
    }

    public static boolean isMapFull() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                if (map[i][j] == '*') {
                    return false;
                }
            }
        }
        return true;
    }


    public static int[] aiTurn() {
        int[] turnXY = new int[2];
        do {
            turnXY[0] = rnd.nextInt(map.length);
            turnXY[1] = rnd.nextInt(map.length);
        } while (!isCellValid(turnXY[0], turnXY[1]));
        map[turnXY[1]][turnXY[0]] = AI_DOT;
        printMap();
        return turnXY;
    }


    public static boolean isCellValid(int x, int y) {
        if (x < 0 || y < 0 || x > map.length - 1 || y > map.length - 1) {
            return false;
        }
        if (map[y][x] == '*') {
            return true;
        }
        return false;
    }

    public static int[] humanTurn() {
        int[] turnXY = new int[2];
        do {
            System.out.println("Введите ячейку в формате x y");
            turnXY[0] = scanner.nextInt() - 1;
            turnXY[1] = scanner.nextInt() - 1;
        } while (!isCellValid(turnXY[0], turnXY[1]));
        map[turnXY[1]][turnXY[0]] = HUMAN_DOT;
        printMap();

        return turnXY;
    }

    public static void printMap() {
        System.out.print("  ");
        for (int i = 1; i <= map.length; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < map.length; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < map.length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void initMap(int x) {
        map = new char[x][x];
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                map[i][j] = '*';
            }
        }
    }

}