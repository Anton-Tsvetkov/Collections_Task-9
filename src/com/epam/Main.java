package com.epam;

import java.util.Stack;

public class Main {
    public static boolean isBracketsOrderCorrect(String string) {
        Stack<Character> bracketsStack = new Stack<>();
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == '('
                    || string.charAt(i) == '['
                    || string.charAt(i) == '{') {
                bracketsStack.push(string.charAt(i));
            } else if (string.charAt(i) == ')'
                    || string.charAt(i) == ']'
                    || string.charAt(i) == '}') {
                if (!bracketsStack.empty()) {
                    char pop = bracketsStack.pop();
                    if (pop == '(' && string.charAt(i) != ')'
                            || pop == '[' && string.charAt(i) != ']'
                            || pop == '{' && string.charAt(i) != '}') {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {

        String strCorrect1 = "()[]{}";
        String strCorrect2 = "()[{}]";
        String strWrong1 = ")([[{}]";
        String strWrong2 = "()[{]}";

        System.out.println(isBracketsOrderCorrect(strCorrect1));
        System.out.println(isBracketsOrderCorrect(strCorrect2));
        System.out.println(isBracketsOrderCorrect(strWrong1));
        System.out.println(isBracketsOrderCorrect(strWrong2));


    }

}
