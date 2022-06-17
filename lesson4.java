package HomeWork.lesson4;

import java.util.Random;
import java.util.Scanner;

public class lesson4 {
    public static int size = 3;
    public static int win = 3;
    public static final char empty = '•';
    public static final char X = 'X';
    public static final char O = 'O';
    public static char[][] table;
    public static Scanner scan = new Scanner(System.in);
    public static Random rand = new Random();
    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            MyTurn();
            printMap();
            if (checkWin(X)) {
                System.out.println("Победа");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            CopmTurn();
            printMap();
            if (checkWin(O)) {
                System.out.println("Потрачено");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра окончена");
    }
    public static void initMap() {
        table = new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                table[i][j] = empty;
            }
        }
    }
    public static void printMap() {
        for (int i = 0; i <= size; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < size; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < size; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void MyTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = scan.nextInt() - 1;
            y = scan.nextInt() - 1;
        } while (!isCellValid(x, y)); // while(isCellValid(x, y) == false)
        table[y][x] = X;
    }
    public static void CopmTurn() {
        int x, y;
        do {
            x = rand.nextInt(size);
            y = rand.nextInt(size);
        } while (!isCellValid(x, y));
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y +
                1));
        table[y][x] = O;
    }
    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= size || y < 0 || y >= size) return false;
        if (table[y][x] == empty) return true;
        return false;
    }
    public static boolean checkWin(char dot) {
        for (int i = 0; i < size; i++)
            if ((table[i][0] == dot && table[i][1] == dot &&
                    table[i][2] == dot) ||
                    (table[0][i] == dot && table[1][i] == dot &&
                            table[2][i] == dot))
                return true;
        if ((table[0][0] == dot && table[1][1] == dot &&
                table[2][2] == dot) ||
                (table[2][0] == dot && table[1][1] == dot &&
                        table[0][2] == dot))
            return true;
        return false;
    }
    public static boolean isMapFull() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (table[i][j] == empty) return false;
            }
        }
        return true;
    }
}

