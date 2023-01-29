package com.skillbox;

import java.util.Scanner;

public class Main {
    static int water = 2500;
    int coffee = 500;
    int milk = 1000;

    public static void main(String[] args) {

        while (true) {
            // Алгоритм работы кофемашины
            // 1. Нажать кнопку выбора напитка
            System.out.print("\nВыберете напиток:\n1.Каппучино\n2.Американо\n3.Эспрессо\nНапиток №: ");
            Scanner scanner = new Scanner(System.in);
            int select = Integer.parseInt(scanner.nextLine());
            if (select == 1){
                System.out.println("Готовится Ваш каппучино");
                boil(150);
            } else if (select == 2){
                System.out.println("Готовится Ваш Американо");
                boil(200);
            } else if (select == 3){
                System.out.println("Готовится Ваш эспрессо");
                boil(70);
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
     * @param waterBoil
     */
    public static void boil(int waterBoil) {
        // Проверить количество воды
        if (water < 200) {
            System.out.println("Долейте воды!");
            return;
        }
        // Кипятим 200 милилитров
        water = water - waterBoil;
        System.out.println("Воды израсходовано: " + waterBoil);
        System.out.println("Воды осталось: " + water);
    }
}
