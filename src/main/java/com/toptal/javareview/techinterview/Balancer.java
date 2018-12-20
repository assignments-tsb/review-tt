package com.toptal.javareview.techinterview;

public class Balancer {

    /**
     * An S string is built up from "+" and "-" characters exclusively.
     * The balance of such string is the number of all plus characters subtracted by the number of all minus characters within S.
     *
     * For example the balance of "++-+" is 2 and the balance of "+-+-" is 0.
     *
     * You can modify the account balance by removing the right most character.
     * This result can be further modified using this same method until the resulting string is empty.
     *
     * Your task is to write a function that accepts String S and Integer N.
     * This function returns the minimum number of removals necessary for the balance to become greater than or equal to N.
     * If the desired balance isn’t achievable the function should return -1.
     *
     * @param S
     * @param N
     * @return
     */
    int balance(String S, int N) {

        int currentBalance = 0;

        for (int i=0; i<S.length(); i++) {
            if (S.charAt(i) == '+') currentBalance++;
            else currentBalance--;
        }

        int minSteps = 0;

        for (int i=S.length()-1; i>0; i--) {
            if (currentBalance >= N) {
                    System.out.println("min" + minSteps);
                return minSteps;
            }

            minSteps++;

            if (S.charAt(i) == '+') currentBalance--;
            else currentBalance++;
        }

        System.out.println("-1");

        return -1;
    }
}
