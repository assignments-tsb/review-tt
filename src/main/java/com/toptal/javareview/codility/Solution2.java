package com.toptal.javareview.codility;

// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution2 {

    public int solution(String[] T, String[] R) {
        // T[0] = "test1a"  R[0] = "Wrong answer"       -0
        // T[2] = "test1b"  R[2] = "Runtime error"      -0
        // T[3] = "test1c"  R[3] = "OK"                 -0
        // T[1] = "test2"   R[1] = "OK"                 -100
        // T[4] = "test3"   R[4] = "Time limit exceeded"-0
        // 1* 100 / 3 = 33.3

        Map<String, Boolean> scoredGroup = new HashMap<String, Boolean>();

        for(int i=0; i<T.length; i++) {
            String group = extractGroup(T[i]);
            Boolean passed = R[i].equals("OK");

            //System.out.println("g=" + group + ", " + "p=" + passed);

            if (!passed) scoredGroup.put(group, passed);

            if (scoredGroup.get(group) == null) {
                scoredGroup.put(group, passed);
            }
        }

        int groupCount = 0;
        int passedCount = 0;
        for(Map.Entry<String, Boolean> group : scoredGroup.entrySet()) {
            groupCount++;
            if (group.getValue()) passedCount++;
        }

        //System.out.println("passedCount=" + passedCount + "groupCount=" + groupCount);

        return passedCount * 100 / groupCount;
    }

    String extractGroup(String s) {

        if (
                Character.isLowerCase( s.charAt(s.length()-1) ) &&
                        Character.isDigit( s.charAt(s.length()-2) )
        ){
            return s.substring(0, s.length()-1);
        }
        return s;
    }
}
