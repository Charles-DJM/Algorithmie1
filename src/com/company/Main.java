package com.company;

import java.util.ArrayList;

//TODO: Tri Rapide, Tri par base, tri par fusion(en utilisant linkedList)


public class Main {

    public static void main(String[] args) {
        ArrayList list = new RandomList().generate(10, 20);
        RandomList.afficher(list);
        ArrayList<Comparable> sortedList = list.clone();
        System.out.println();
        RandomList.afficher(sortedList);

    }
}
