package java1.lesson6;

public class Homework6 {
    public static void main(String[] args) {
        
        Animals dog = new Dogs("Пес Бобик", "рыжий", 4);
        Animals cat = new Cats("Кот Мурзик", "белый", 2);
        System.out.println("\nЗабег животных! \nУчаствуют: ");
        Animals[] animals = {dog, cat};
        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i].toString());
        }
        int runLength = 800;
        System.out.println("\nПервое испытание: забег на " + runLength + " метров!\nИтак, сейчас мы узнаем, кто же выдержал это испытание: ");
        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i].getName() + (animals[i].run(runLength) ? "" : " не") + " пробежал!");
        }
        float jumpLength = 0.1f;
        System.out.println("\nВторое испытание: прыжок на " + jumpLength + " метров!\nИтак, сейчас мы узнаем, кто же выдержал это испытание: ");
        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i].getName() + (animals[i].jump(jumpLength) ? "" : " не") + " прыгнул!");
        }
        int swimLength = 50;
        System.out.println("\nТретье испытание: заплыв на " + swimLength + " метров!\nИтак, сейчас мы узнаем, кто же выдержал это испытание: ");
        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i].getName() + (animals[i].swim(swimLength) ? "" : " не") + " проплыл!");
        }
    }

}
