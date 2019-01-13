package lesson1;

public class Homework1 {
    public static void main(String[] args) {
        byte bt = 127;
        short shrt = 32767;
        int integer = 100500;
        long lng = 100500100500L;
        float flt = 3.14f;
        double dbl = 3.1416;
        boolean bln = true;
        char chr = 'Я';
    }

    public static int example (int a, int b, int c, int d) {
        return a * (b + (c / d));
    }

    public static boolean sum (int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20)  {
           return false;
        } else {
            return true;
        }
        //return (sum >= 10 && sum <= 20); упрощенный вариант
    }

    public static void check (int num) {
        if (num >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
        //System.out.println("Число " + ((num >= 0) ? "положительное" : "отрицательное"); упрощенный вариант
    }

    public static boolean checkBool (int num) {
        if (num < 0) {
            return true;
        } else {
            return false;
        }
        //return (num < 0) ? true : false; упрощенный вариант
    }

    public static void name (String name) {
        System.out.println("Привет, " + name + "!");
    }

    public static void checkLeapYear (int year) {
        if ((year % 100 != 0) && (year % 4 == 0) || (year % 400 == 0)) {
            System.out.println("Год високосный");
        } else {
            System.out.println("Год не високосный");
        }
    }
}
/** 9. Не набирая код в IDE, ответьте на следующий вопрос. Есть два метода
    void myMethod(int a, String b) {}
    void myMethod(String b, int a) {}

    Это две разных сигнатуры метода или один и тот же метод?

    Ответ: это две разных сигнатуры метода **/


