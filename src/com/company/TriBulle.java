package com.company;

import java.util.ArrayList;

public class TriBulle {

    public static ArrayList<Comparable> trier(ArrayList<Comparable> list){
        for(int i = list.size(); i >= 2 ; i--){
            for(int j = 0; j < i - 1; j++){
                if(list.get(j).compareTo(list.get(j+1)) > 0){
                   permuter(list, j, j+1);
                }
            }
        }
        return list;
    }

    private static void permuter(ArrayList<Comparable> list, int index1, int index2){
        Comparable t = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, t);
    }
}
