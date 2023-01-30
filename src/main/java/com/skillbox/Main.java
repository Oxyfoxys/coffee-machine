package com.skillbox;

import java.util.Scanner;

public class Main {
    static int water = 2500;
    static int coffee = 500;
    static int milk = 1000;
    static int sugar = 500;

    public static void main(String[] args) {
        while (true) {
            if (water < 200) {
                System.out.println("Долейте воды!");
                return;
            }     else     if (coffee < 50) {
                System.out.println("Добавте зёрен!");
                return;
            } if (milk < 100) {
                System.out.println("Добавте молока!");
                return;
            }
            // Алгоритм работы кофемашины
            // 1. Нажать кнопку выбора напитка
            System.out.print("\nВыберете напиток:\n1.Каппучино\n2.Американо\n3.Эспрессо\nНапиток №: ");
            Scanner scanner = new Scanner(System.in);
            int select = Integer.parseInt(scanner.nextLine());
            if (select == 1) {
                System.out.println("Готовится Ваш каппучино");
                boilWater(150);
                grind(45);
                boilMilk(100);
            } else if (select == 2) {
                System.out.println("Готовится Ваш Американо");
                boilWater(200);
                grind(55);
            } else if (select == 3) {
                System.out.println("Готовится Ваш эспрессо");
                boilWater(70);
                grind(60);
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
        System.out.println("Воды израсходовано: " + waterBoil);
        System.out.println("Воды осталось: " + water);
    }

    /**
     * Метод демонстрации помола кофе
     *
     * @param coffeeGrind
     */
    public static void grind(int coffeeGrind) {
        coffee = coffee - coffeeGrind;
        System.out.println("Кофе израсходовано: " + coffeeGrind);
        System.out.println("Кофе осталось: " + coffee);
    }

    /**
     * Метод демонстрации нагрева молока
     *
     * @param milkBoil расходуемое молоко
     */
    public static void boilMilk(int milkBoil) {
        milk = milk - milkBoil;
        System.out.println("Молока израсходовано: " + milkBoil);
        System.out.println("Молока осталось: " + milk);
    }
    /**
     * Метод демонстрации помола кофе
     *
     * @param addSugar
     */
    public static void add(int addSugar) {
        sugar = sugar - addSugar;
        System.out.println("Сахара израсходовано: " + addSugar);
        System.out.println("Сахара осталось: " + sugar);
    }
}
