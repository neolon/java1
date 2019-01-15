package java1.lesson3;

import java.util.Random;
import java.util.Scanner;

public class Homework3 {

    static Random RANDOM = new Random();

    public static void guessTheNumber() {
        Scanner sc = new Scanner(System.in);
        int count = 3;
        boolean flag = false;
        boolean restart = true;
        while (restart) {
            int random = RANDOM.nextInt(10);
            System.out.println("Угадайте число от 0 до 9. У Вас 3 попытки.");
            for (int i = 0; i < count; i++) {
                int num = sc.nextInt();
                System.out.println(random);
                if (num < random) {
                    System.out.println("Вы ввели число меньше загаданного");
                }
                if (num > random) {
                    System.out.println("Вы ввели число больше загаданного");
                }
                if (num == random) {
                    System.out.println("Вы угадали, это " + random);
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                System.out.println("Вы проиграли!");
            }
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
            restart = sc.nextInt() == 1;
        }
    }

    public static void guessTheString() {
        Scanner sc = new Scanner(System.in);
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli",
                "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom",
                "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        int lengthString = 15;
        int random = RANDOM.nextInt(words.length);
        boolean flag = true;
        while (flag) {
            System.out.println("Угадайте слово");
            String guessWord = sc.nextLine();
            if (guessWord.equals(words[random])) {
                System.out.println("Вы знали!");
                flag = false;
            }
            for (int i = 0; i < lengthString; i++) {
                if ((guessWord.length() > i) && (words[random].length() > i)) {
                    if (guessWord.charAt(i) == words[random].charAt(i)) {
                        System.out.print(guessWord.charAt(i));
                    } else {
                        System.out.print("#");
                    }
                } else {
                    System.out.print("#");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        guessTheNumber();
        guessTheString();
    }
}

