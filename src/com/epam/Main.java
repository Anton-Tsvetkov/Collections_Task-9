package com.epam;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void posNegSwap(List<Integer> integers) {
        Comparator<Integer> comparator = (o1, o2) -> {
            if(o1 < 0 && o2 > 0) return 1;
            else if(o1 > 0 && o2 < 0) return -1;
            else return 0;
        };
        integers.sort(comparator);
    }

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(3);
        integerList.add(5);
        integerList.add(-2);
        integerList.add(7);
        integerList.add(-4);
        integerList.add(-6);
        integerList.add(1);

        posNegSwap(integerList);

        System.out.println(integerList);
    }
}
