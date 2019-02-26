package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

//TODO: Tri Rapide, Tri par base


public class Main {

    public static void main(String[] args) {
        ArrayList list = new RandomList().generate(16, 50);
        System.out.println("liste de départ");
        RandomList.print(list);
        //ArrayList<Comparable> sortedList = (ArrayList<Comparable>)list.clone();

        LinkedList<Comparable> l_fusion = new LinkedList<Comparable>(list);
        l_fusion = SortFusion.sort(l_fusion);
        ArrayList<Comparable> l = new ArrayList<>(l_fusion);
        System.out.println("tri par fusion");
        RandomList.print(l);

        SortBubble.sort(list);
        System.out.println("tri à bulles");
        RandomList.print(list);

    }
}
