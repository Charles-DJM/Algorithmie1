package com.company;

import java.util.LinkedList;

import static java.sql.JDBCType.NULL;

public class SortFusion {

    public static LinkedList<Comparable> sort(LinkedList<Comparable> list){
        if(list.size() > 1){
            LinkedList<Comparable> s1 = new LinkedList<>(list.subList(0, list.size()/2));
            SortFusion.sort(s1);
            LinkedList<Comparable> s2 = new LinkedList<>(list.subList(list.size()/2, list.size()));
            SortFusion.sort(s2);
            //LinkedList<Comparable> s1 = SortFusion.sort((LinkedList<Comparable>)list.subList(0, list.size()/2));
            //LinkedList<Comparable> s2 = SortFusion.sort((LinkedList<Comparable>)list.subList(list.size()/2 +1, list.size()));
            return fusion(s1, s2);
        }
        return list;
    }

    public static LinkedList<Comparable> fusion(LinkedList<Comparable> s1, LinkedList<Comparable> s2){

        if(s1.size() == 0)
            return s2;
        if(s2.size() == 0)
            return s1;
        LinkedList<Comparable> newList = new LinkedList<>();
        while(s1.peekFirst() != NULL  && s2.peekFirst() != NULL){
            if(s1.peekFirst() == NULL){
            newList.addAll(s2);

            return newList;
        }
        if(s2.peekFirst() == NULL){
            newList.addAll(s1);
            return newList;
        }

            if(s1.peekFirst().compareTo(s2.peekFirst()) < 0)
                newList.add(s1.pop());
            else
                newList.add(s2.pop());
        }
        return newList;
    }
}
