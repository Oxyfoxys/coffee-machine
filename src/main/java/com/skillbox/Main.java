package com.skillbox;

import java.util.Scanner;

public class Main {
    static int water = 2500;
    static int coffee = 500;
    static int milk = 1500;
    static int sugar = 200;
    static int cocoa = 500;

    public static void main(String[] args) {
        while (true) {
            if (water < 200) {
                System.out.println("Долейте воды!");
                return;
            } else if (coffee < 50) {
                System.out.println("Добавте зёрен!");
                return;
            } else if (milk < 100) {
                System.out.println("Добавте молока!");
                return;
            } else if (sugar < 10) {
                System.out.println("Добавте зёрен!");
                return;
            } else if (cocoa < 25){
                System.out.println("Добавте какао!");
                return;
            }
            // TODO: 30.01.2023 Добавить проверку какао 
            // TODO: 30.01.2023 Вместо постоянного вывода остатков, сделать вывод предупреждения о малом колличестве 
            // Алгоритм работы кофемашины
            // 1. Нажать кнопку выбора напитка
            System.out.print("\nВыберете напиток:\n1.Каппучино\n2.Американо\n3.Эспрессо\n4.Латте\n5.Какао\nНапиток №: ");
            Scanner scanner = new Scanner(System.in);
            int select = Integer.parseInt(scanner.nextLine());
            if (select == 1) {
                System.out.println("Готовится Ваш каппучино");
                boilWater(150);
                grind(45);
                boilMilk(100);
                add(15);
            } else if (select == 2) {
                System.out.println("Готовится Ваш Американо");
                boilWater(200);
                grind(55);
                add(10);
            } else if (select == 3) {
                System.out.println("Готовится Ваш эспрессо");
                boilWater(70);
                grind(60);
                add(5);
            } else if (select == 4) {
                System.out.println("Готовится Ваш латте");
                boilWater(50);
                grind(40);
                boilMilk(80);
            } else if (select == 5) {
                System.out.println("Готовится Ваш какао");
                boilMilk(200);
                sprinkle(35);
                add(15);
            } else {
                System.out.println("Такого напитка нет");
            }

            // 2. Приготовление кофе
            // 2.1 Кипятим воду
            // 2.2 Перемалываем кофе
            // 2.3 Делаем пенку из молока
            // 2.4 Очистить кофемашину
            // 3. Выдать напиток
        }
    }

    /**
     * Метод демонстрации нагрева воды
     *
     * @param waterBoil
     */
    public static void boilWater(int waterBoil) {
        water = water - waterBoil;
        for (int i = 0; i <= 100; i += 10) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Вода закипела на: " + i + "%");
        }
        System.out.println("Воды израсходовано: " + waterBoil);
        System.out.println("Воды осталось: " + water);
    }

    /**
     * Метод демонстрации помола кофе
     *
     * @param coffeeGrind
     */
    public static void grind(int coffeeGrind) {
        // TODO: 30.01.2023 Сделать процесс помола кофе более естественным - с таймингом
        coffee = coffee - coffeeGrind;
        for (int i = 0; i <= 100; i += 10) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Кофе перемолот на: " + i + "%");
        }
        System.out.println("Кофе израсходовано: " + coffeeGrind);
        System.out.println("Кофе осталось: " + coffee);
    }

    /**
     * Метод демонстрации нагрева молока
     *
     * @param milkBoil расходуемое молоко
     */
    public static void boilMilk(int milkBoil) {
        // TODO: 30.01.2023 Сделать процесс кипячения молока более естественным - с тайминго
        milk = milk - milkBoil;
        for (int i = 0; i <= 100; i += 10) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Молоко закипело на: " + i + "%");
        }
        System.out.println("Молока израсходовано: " + milkBoil);
        System.out.println("Молока осталось: " + milk);
    }

    /**
     * Метод демонстрации добавления сахара
     *
     * @param addSugar
     */
    public static void add(int addSugar) {
        // TODO: 30.01.2023 Добавить не цикличный тайминг добавления сахара Thread.sleep();
        sugar = sugar - addSugar;
        for (int i = 0; i <= 100; i += 10) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("сахар насыпан" + i + "%");
        }
        System.out.println("Сахара израсходовано: " + addSugar);
        System.out.println("Сахара осталось: " + sugar);
    }

    /**
     * Метод демонстрации насыпания какао
     *
     * @param sprinkleCocoa
     */
    public static void sprinkle(int sprinkleCocoa) {
        // TODO: 30.01.2023 Добавить не цикличный тайминг добавления кокао Thread.sleep();
        cocoa = cocoa - sprinkleCocoa;
        for (int i = 0; i <= 100; i += 10) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Какао насыпано на: " + i + "%");
        }
        System.out.println("Какао израсходовано: " + sprinkleCocoa);
        System.out.println("Какао осталось: " + cocoa);
    }
}
