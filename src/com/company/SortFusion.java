package com.company;

import java.util.LinkedList;

import static java.sql.JDBCType.NULL;

public class SortFusion {

    public static LinkedList<Comparable> sort(LinkedList<Comparable> list){
        if(list.size() > 1){
            LinkedList<Comparable> s1 = new LinkedList<>(list.subList(0, list.size()/2));
            LinkedList<Comparable> s2 = new LinkedList<>(list.subList(list.size()/2, list.size()));
            return fusion(SortFusion.sort(s1), SortFusion.sort(s2));
        }
        return list;
    }

    public static LinkedList<Comparable> fusion(LinkedList<Comparable> s1, LinkedList<Comparable> s2){

        LinkedList<Comparable> newList = new LinkedList<>();

        while(s1.size() != 0 && s2.size() != 0){

            if (s1.getFirst().compareTo(s2.getFirst()) < 0) {
                newList.add(s1.pop());
            } else {
                newList.add(s2.pop());
            }

        }

        if(s1.size() == 0)
            newList.addAll(s2);
        if(s2.size() == 0)
            newList.addAll(s1);

        return newList;
    }
}
