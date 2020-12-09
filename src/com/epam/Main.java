package com.epam;

import java.util.Stack;

public class Main {

    public static void stackSwap(Stack<Integer> one, Stack<Integer> two) {
        Stack<Integer> copy = new Stack<>();
        copy.addAll(one);
        one.clear();
        one.addAll(two);
        two.clear();
        two.addAll(copy);
    }

    public static void main(String[] args) {
        Stack<Integer> one = new Stack<>();
        one.add(1);
        one.add(2);
        one.add(3);

        Stack<Integer> two = new Stack<>();
        two.add(10);
        two.add(20);
        two.add(30);

        System.out.println("One: " + one.toString() + "\nTwo: " + two.toString());
        stackSwap(one, two);
        System.out.println();
        System.out.println("One: " + one.toString() + "\nTwo: " + two.toString());

    }
}
