package com.company;
import java.util.ArrayList;
import java.util.Random;

public class RandomList{

    private Random rand;

    public RandomList(){
        rand = new Random();
    }

    ArrayList generate(int taille, int maximum){
        ArrayList<Comparable> list = new ArrayList<>();
        for(int i = 0; i <= taille; i++){
            list.add(rand.nextInt(maximum));
        }
        return list;
    }

    public static void afficher(ArrayList<Comparable> list){
        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
    }
}
