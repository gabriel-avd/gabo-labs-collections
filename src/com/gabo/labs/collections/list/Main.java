package com.gabo.labs.collections.list;

import java.util.ArrayList;

public class Main {
    /*
        LIST
            -Implementations: LinkedList, ArrayList, Stack, Vector
            -Mantienen el orden de insercion.
            -Permiten Duplicados
     */
    public static void main(String[] args) {


        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(5);
        arrayList.add(7);
        arrayList.add(2);
        arrayList.add(4);
        arrayList.add(1);
        arrayList.add(7);

        System.out.println("Imprimiendo numeros:" + arrayList);

    }
}
