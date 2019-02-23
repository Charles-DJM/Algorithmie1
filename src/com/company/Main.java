package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

//TODO: Tri Rapide, Tri par base, tri par fusion(en utilisant linkedList)


public class Main {

    public static void main(String[] args) {
        ArrayList list = new RandomList().generate(16, 50);
        RandomList.print(list);
        //ArrayList<Comparable> sortedList = (ArrayList<Comparable>)list.clone();

        //SortBubble.sort(list);
        //RandomList.print(list);
        LinkedList<Comparable> l_fusion = new LinkedList<Comparable>(list);
        l_fusion = SortFusion.sort(l_fusion);
        ArrayList<Comparable> l = new ArrayList<>(l_fusion);
        RandomList.print(l);

    }
}
