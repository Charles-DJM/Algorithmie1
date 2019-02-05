package com.company;

import java.util.ArrayList;

public class SortBubble {

    public static void sort(ArrayList<Comparable> list){
        for(int i = list.size(); i >= 2 ; i--){
            for(int j = 0; j < i - 1; j++){
                if(list.get(j).compareTo(list.get(j+1)) > 0){
                   permute(list, j, j+1);
                }
            }
        }
    }

    private static void permute(ArrayList<Comparable> list, int index1, int index2){
        Comparable t = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, t);
    }
}
