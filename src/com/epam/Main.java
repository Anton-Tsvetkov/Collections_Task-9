package com.epam;

import java.util.Stack;

public class Main {

    public static void digitsReverse(int number) {

        String numbAsString = String.valueOf(number);

        Stack<Character> digits = new Stack<>();
        String reverse = "";

        for(int i = 0; i < numbAsString.length(); i++){
            digits.push(numbAsString.charAt(i));
        }
        while (!digits.empty()) {
            reverse = reverse.concat(String.valueOf(digits.pop()));
        }
        System.out.println(reverse);
    }

    public static void main(String[] args) {
        digitsReverse(12345);
    }
}
