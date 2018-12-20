package com.toptal.javareview.codility;

public class Solution1 {

    public String solution(String S) {
        String sol = S;
        while (sol.contains("AA") || sol.contains("BB") || sol.contains("CC")) {
            sol = sol.replace("AA", "").replace("BB", "").replace("CC", "");
        }

        return sol;
    }
}
