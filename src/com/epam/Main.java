package com.epam;


// 8. Задана строка, состоящая из символов «(», «)», «[», «]», «{», «}».
//    Проверить правильность расстановки скобок.
//    Использовать стек.

public class Main {
    public static boolean isBracketsOrderCorrect(String string){
        boolean bracketsOrderCorrect = false;



        return bracketsOrderCorrect;
    }

    public static void main(String[] args) {

        String strCorrect = "()[]{}";
        String strWrong1 = ")([[{}]";
        String strWrong2 = "()[{]}";

        System.out.println(isBracketsOrderCorrect(strCorrect));
        System.out.println(isBracketsOrderCorrect(strWrong1));
        System.out.println(isBracketsOrderCorrect(strWrong2));



    }

}
