package com.aditya.programs;

import java.util.*;

public class BuzzDaySale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] id = new int[n];
        int[] costs = new int[n];
        for (int i = 0; i < n; i++) {
            id[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            costs[i] = sc.nextInt();
        }
        int budget = sc.nextInt();

        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(i, new ArrayList<>());
            for (int j = 0; j < n; j++) {
                if (i != j && id[i] % id[j] == 0) {
                    map.get(i).add(j);
                }
            }
        }

        int maxItems = 0;
        int maxCost = 0;

        for (int i = 0; i < n; i++) {
            int cost = costs[i];
            if (cost > budget) continue;

            int q = budget / cost;
            List<Integer> items = map.get(i);

            int count = items.size() * q;
            int worth = 0;
            for (int idx : items) {
                worth += costs[idx] * q;
            }

            if (count > maxItems ||
                    (count == maxItems && worth > maxCost)) {
                maxItems = count;
                maxCost = worth;
            }
        }

        System.out.println(maxItems + " " + maxCost);
        sc.close();
    }
}
