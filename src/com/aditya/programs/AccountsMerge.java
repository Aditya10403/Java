package com.aditya.programs;

import java.util.*;

public class AccountsMerge {
    public static void main(String[] args) {
        List<List<String>> accounts = new ArrayList<>();
        accounts.add(Arrays.asList("John", "johnsmith@mail.com", "john_newyork@mail.com"));
        accounts.add(Arrays.asList("John", "johnsmith@mail.com", "john00@mail.com"));
        accounts.add(Arrays.asList("Mary", "mary@mail.com"));
        accounts.add(Arrays.asList("John", "johnnybravo@mail.com"));
//        System.out.println(accountsMerge(accounts));
    }


//    private static List<List<String>> accountsMerge(List<List<String>> accounts) {
//        List<List<String>> res = new ArrayList<>();
//        Map<String, TreeSet<String>> map = new HashMap<>();
//        int n = accounts.size();
//        for (List<String> account : accounts) {
//            String name = account.getFirst();
//            int idx = 1;
//            while (idx < account.size()) {
//                if (map.containsKey(name) && map.get(name).contains(account.get(idx))) {
//                    map.get(name).add();
//                }
//                idx++;
//            }
//        }
//        return res;
//    }
}
