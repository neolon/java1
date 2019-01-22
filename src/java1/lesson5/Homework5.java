package java1.lesson5;

public class Homework5 {
    /*
        1. Создать класс "Сотрудник" с полями: ФИО, должность, телефон, зарплата, возраст;
        2. Конструктор класса должен заполнять эти поля при создании объекта;
        3. Внутри класса «Сотрудник» написать методы, которые возвращают значение каждого поля;
        4. Вывести при помощи методов из пункта 3 ФИО и должность.
        5. Создать массив из 5 сотрудников. С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
        6. * Создать метод, повышающий зарплату всем сотрудникам старше 45 лет на 5000. Метод должен принимать в качестве параметра
    массив сотрудников. Вывести в main() возраст и зарплату сотрудника до и после вызова метода;
        7. ** Написать методы (принимающие на вход массив сотрудников), вычисляющие средний возраст и среднюю зарплату сотрудников,
    вывести результаты работы в консоль.
     */
    public static void main(String[] args) {
        Employees[] employees = {
                new Employees("Иванов", "Борис", "Васильевич", "менеджер", "234-34-34", 30000, 35),
                new Employees("Петров", "Николай", "Сергеевич", "руководитель проекта", "654-87-12", 60000, 41),
                new Employees("Сидоров", "Андрей", "Михайлович", "программист", "543-76-23", 50000, 27),
                new Employees("Васильева", "Елена", "Алексеевна", "бухгалтер", "121-32-45", 45000, 50),
                new Employees("Ивашкина", "Марина", "Федоровна", "уборщица", "345-12-78", 20000, 60)
        };
        System.out.println("Сотрудники: ");
        for (int i = 0; i < employees.length; i++) {
            System.out.println("\nФ.И.О.: " + employees[i].getSurname() + " " + employees[i].getName() + " " + employees[i].getPatronymic());
            System.out.println("Должность: " + employees[i].getPosition());

        }

        System.out.println("\nСотрудники старше 40 лет: ");
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getAge() >= 40) {
                System.out.println(employees[i].getSurname() + " " + employees[i].getName() + " " + employees[i].getPatronymic() + ", " + employees[i].getAge() + " лет, "
                        + employees[i].getPosition() + ", " + employees[i].getPhoneNumber());
            }
        }


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
