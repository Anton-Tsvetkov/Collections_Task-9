package com.epam;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static Set<Integer> intersectionSets(Set<Integer> one, Set<Integer> two){
        Set<Integer> intersectionSet = new HashSet<>();
        for(Integer numb : one){
            if(two.contains(numb)) intersectionSet.add(numb);
        }
        return  intersectionSet;
    }

    public static Set<Integer> unionSets(Set<Integer> one, Set<Integer> two){
        Set<Integer> unionSet = new HashSet<>(one);
        unionSet.addAll(two);
        return unionSet;
    }


    public static void main(String[] args) {
        Set<Integer> one = new HashSet<>();
        one.add(1);
        one.add(2);
        one.add(3);
        one.add(4);
        one.add(5);

        Set<Integer> two = new HashSet<>();
        two.add(6);
        two.add(3);
        two.add(7);
        two.add(9);
        two.add(4);

        System.out.println("Intersection: " + intersectionSets(one, two));
        System.out.println("Union: " + unionSets(one, two));
    }

}
