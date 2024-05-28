package Esercizi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Esercizio2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("The");
        list.add("Quick");
        list.add("Brown");
        list.add("Fox");
        printPosition(list, false);


    }

    public static void numberList(int n) {
        Random nRandom = new Random();
        ArrayList<Integer> numeri = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            numeri.add(nRandom.nextInt(0, 100));
            Collections.sort(numeri);
        }
        System.out.println(numeri);
    }

    public static void inverseList(ArrayList<String> list) {

        System.out.println("Lista normale: " + list);
        list.addAll(list.reversed());
        System.out.println("Lista invertita: " + list);
    }

    public static void printPosition(ArrayList<String> list, boolean value) {
        if (value) {
            for (int i = 0; i < list.size(); i++) {
                if (i % 2 == 0) {
                    System.out.println("Posizioni Pari: " + list.get(i));
                }
            }
        } else {
            for (int i = 0; i < list.size(); i++) {
                if (i % 2 != 0) {
                    System.out.println("Posizioni Dispari: " + list.get(i));
                }
            }
        }

    }
}
