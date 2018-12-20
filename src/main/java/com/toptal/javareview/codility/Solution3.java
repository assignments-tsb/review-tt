package com.toptal.javareview.codility;

// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution3 {

    class Node {
        String moves = "";
        int L = 0;
        int R = 1;

        public Node(){}
        public Node(String moves, int L, int R) {
            this.moves = moves;
            this.L = L;
            this.R = R;
        }
    }

    public String solution(int N) {
        /**
         * ahhhh, brute force T___T
         * no time to think....sorry
         *     -> -1,1
         * 0,1 ->
         *     ->  0,2
         *
         */
        Node start = new Node();
        List<Node> leafNodes = Collections.singletonList(start);
        while (leafNodes.size() < 100000000) {
            List<Node> newLeafNodes = new LinkedList<>();

            for(Node node: leafNodes) {
                Node left = new Node(node.moves+"L", calcLeft(node.L, node.R), node.R);
                Node right = new Node(node.moves+"R", node.L, calcRight(node.L, node.R));

                if (left.L == N || left.R == N) return left.moves;
                if (right.L == N || right.R == N) return right.moves;

                newLeafNodes.add(left);
                newLeafNodes.add(right);
            }

            leafNodes = newLeafNodes;
        }

        return "impossible";
    }

    int calcLeft(int L, int R) {
        return 2 * L - R;
    }

    int calcRight(int L, int R) {
        return 2 * R - L;
    }
}
