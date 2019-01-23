package java1.lesson3;

import java.util.Random;
import java.util.Scanner;

public class Homework4 {

    static final int width = 3;
    static final int heigth = 3;
    static final Random rand = new Random();
    static final char PLAYER_DOT = 'X';
    static final char AI_DOT = 'O';
    static final char EMPTY_DOT = ' ';
    static Scanner scanner = new Scanner(System.in);
    static char[][] field = new char[heigth][width];

    private static void initField() {
        for (int i = 0; i < heigth; i++) {
            for (int j = 0; j < width; j++) {
                field[i][j] = EMPTY_DOT;
            }
        }
    }

    private static void printField() {
        System.out.println("-------");
        for (int i = 0; i < heigth; i++) {
            System.out.print("|");
            for (int j = 0; j < width; j++) {
                System.out.print(field[i][j] + "|");
            }
            System.out.println();

        }
        System.out.println("-------");
    }

    private static void setSym(int y, int x, char sym) {
        field[y][x] = sym;
    }

    private static void playerStep() {
        int x;
        int y;
        do {
            System.out.println("Введите координаты X Y (от 1 до 3)");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(y, x));
        setSym(y, x, PLAYER_DOT);
    }

    private static void aiStep() {
        int x;
        int y;
        do {
            System.out.println("Введите координаты X Y (от 1 до 3)");
            x = rand.nextInt(width);
            y = rand.nextInt(heigth);
        } while (!isCellValid(y, x));
        setSym(y, x, AI_DOT);
    }


    private static boolean isCellValid(int y, int x) {
        if (x < 0 || y < 0 || x > width - 1 || y > heigth - 1) {
            return false;
        }
        return (field[y][x] == EMPTY_DOT);
    }

    private static boolean isFilledFull() {
        for (int i = 0; i < heigth; i++) {
            for (int j = 0; j < width; j++) {
                if (field[i][j] == EMPTY_DOT) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean checkWin(char sym) {

        if (field[0][0] == sym && field[0][1] == sym && field[0][2] == sym) {
            return true;
        }
        if (field[1][0] == sym && field[1][1] == sym && field[1][2] == sym) {
            return true;
        }
        if (field[2][0] == sym && field[2][1] == sym && field[2][2] == sym) {
            return true;
        }
        if (field[0][0] == sym && field[1][0] == sym && field[2][0] == sym) {
            return true;
        }
        if (field[0][1] == sym && field[1][1] == sym && field[2][1] == sym) {
            return true;
        }
        if (field[0][2] == sym && field[1][2] == sym && field[2][2] == sym) {
            return true;
        }
        if (field[0][0] == sym && field[1][1] == sym && field[2][2] == sym) {
            return true;
        }
        if (field[2][0] == sym && field[1][1] == sym && field[0][2] == sym) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        initField();
        printField();

        while (true) {
            playerStep();
            printField();
            if (checkWin(PLAYER_DOT)) {
                System.out.println("Победа!");
                break;
            }
            if (isFilledFull()) {
                System.out.println("Ничья!");
                break;
            }
            aiStep();
            printField();
            if (checkWin(AI_DOT)) {
                System.out.println("Проигрыш!");
                break;
            }
            if (isFilledFull()) {
                System.out.println("Ничья!");
                break;
            }
        }

    }
}



