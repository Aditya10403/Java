package com.aditya.programs;

import java.util.LinkedList;
import java.util.Queue;

public class Dota2Senate {
    public static void main(String[] args) {
        String s = "RD";
        System.out.println(predictPartyVictory(s));
    }

    private static String predictPartyVictory(String s) {
        if (s.isEmpty() || s.length() == 1) return s;
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'R') q1.add(i);
            else q2.add(i);
        }
        while (!q1.isEmpty() && !q2.isEmpty()) {
            int r = q1.poll();
            int d = q2.poll();
            if (r < d) q1.add(r + n);
            else q2.add(d + n);
        }
        return q1.size() > q2.size() ? "Radiant" : "Dire";
    }

}
