package ru.geekbrains.java3.lesson1.generics;

import java.util.ArrayList;

public class Stats<T extends Integer> {
    public T[] items;

    public Stats(T... items) {
        this.items = items;
    }


    /**
     * Задача 2. Написать метод, который преобразует массив в ArrayList;
     *
     * @return ArrayList
     */
    public ArrayList convertToArrayList() {

        ArrayList arr = new ArrayList();
        String str = new String();

        for (int i = 0; i < items.length; i++) {
            str = items[i].toString();
            arr.add(str);
        }

        return arr;
    }

    /**
     *
     * @param args
     */

    public static void main(String args[]) {
        Stats<Integer> intStats = new Stats<Integer>(1, 2, 3, 4, 5);

        System.out.println(intStats.convertToArrayList().toString());

        System.out.println("Hello, World!");
    }


}

