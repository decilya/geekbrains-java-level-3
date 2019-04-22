package ru.geekbrains.java3.lesson1.generics;

import ru.geekbrains.java3.lesson1.generics.fruits.Fruit;

/**
 * Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта,
 * поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
 */
public class Box<T extends Fruit> {
    public T[] items;

    public Box(T... items) {
        this.items = items;
    }
}
