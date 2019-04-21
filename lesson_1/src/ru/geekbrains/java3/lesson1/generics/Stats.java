package ru.geekbrains.java3.lesson1.generics;

public class Stats<T extends Integer> {
    public T[] items;

    public Stats(T... items) {
        this.items = items;
    }


//    public void changeArr(int a, int b){
//        this.items[a] = b; //
//    }

    public static void main(String args[]) {
        Stats<Integer> intStats = new Stats<Integer>(1, 2, 3, 4, 5);

        intStats.items[0] = 1;


    }


}

