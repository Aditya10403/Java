package com.aditya.programs;

import java.util.*;

public class QuestionsAcc {
    static int max = Integer.MIN_VALUE;
    public static void main(String[] args) {
//        int[] nums = { 4, 0, 7, 9, 6, 4, 2 };
//        System.out.println(oddevensum(nums));

//        String s = "bB1_89";
//        System.out.println(checkpassword(s));

//        String b = "1C0C1C1A0B1";
//        System.out.println(calculateBinaryOperations(b));

//        int[] res = greatest(nums);
//        System.out.println(res[0] + " " + res[1]);

//        int[] houses = { 2, 8, 3, 5, 7, 4, 1, 2 };
//        System.out.println(noOfhouses(houses, 7, 2));

//        System.out.println(fibonacci(8)); // 0 1 1 2 3 5 8 13

//        int[] nums = new int[3];
//        Scanner sc = new Scanner(System.in);
//        int k = sc.nextInt();
//        for (int i = 0; i < 3; i++) {
//            nums[i] = sc.nextInt();
//        }
//        ArrayList<Integer> temp = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
//        Collections.reverse(temp);
//        System.out.println(temp);
//        LongestSets(nums, temp, 0, k);
//        System.out.println(max);

//        String str = "abbcd";
//        System.out.println(LongestSequence(str));

//        int n = 10; // 1010 - 0011(3)
//        System.out.println(minimizeBinary(n));
//        sc.close();

        // kadane's Algo
//        int[] nums = { -2,-3, 4, -1, -2, 1, 5, -3 };
//        int sum = 0;
//        int max = Integer.MIN_VALUE;
//        int start = -1, end = -1;
//        for (int i = 0; i < nums.length; i++) {
//            if (sum < 0) sum = 0;
//
//            if (sum == 0) start = i;
//
//            sum += nums[i];
//            if (sum > max) {
//                max = sum;
//                end = i;
//            }
//        }
//
//        System.out.println(max + " " + start + "->" + end);
//
//        PriorityQueue<Integer> pq = new PriorityQueue<>();


        // reverse a no
//        int n = 985764;
//        int n = Integer.parseInt(String.valueOf(new StringBuilder(Integer.toString(n)).reverse()));
//        System.out.println(n);
//        String st = "cat", t = "rat";
//        System.out.println(isAnagramAdv(st, t));

//        int n = 10;
//        System.out.println(minBinary(n));

//        String s = "scissors";
//        System.out.println(rps(s));

        String s = "abaabbcc";
        System.out.println(stringtransform(s));

    }

    private static String stringtransform(String s) {
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (c[i] == 'a') c[i] = 'b';
            else if (c[i] == 'b') c[i] = 'a';
        }
        return new String(c);
    }

    private static String rps(String s) {
        if (s.equals("scissors")) return "rock";
        else if (s.equals("paper")) return "scissors";
        else return "paper";
    }

    private static int minBinary(int n) {
        int ones = 0, res = 0;
//        StringBuilder s = new StringBuilder();
        while (n != 0) {
//            if ((n & 1) == 1) {
//                ones++;
////                s.append(1);
//            }
            ones += n & 1;
            n >>= 1;
        }
//        for (int i = 0; i < ones; i++) {
//            res += (int) Math.pow(2, i);
//        }
        res = (int) Math.pow(2, ones) - 1;
//        res = Integer.parseInt(String.valueOf(s));
        return  (ones == 0) ? 0 : res;
    }

    public static boolean isAnagramAdv(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] letterCount = new int[26];
        for (char c: s.toCharArray()) {
            letterCount[c - 'a']++;
        }
        for (char c: t.toCharArray()) {
            letterCount[c - 'a']--;
        }
        for (int i: letterCount) {
            if (i != 0) return false;
        }
        return true;
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch)+1);
            } else {
                map.put(ch, 1);
            }
        }
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch)-1);
            } else {
                return false;
            }
        }
        for (Integer num: map.values()) {
            if (num != 0) {
                return false;
            }
        }
        return true;
    }

    private static void LongestSets(int[] nums, ArrayList<Integer> temp, int index, int k) {
        if (index == nums.length) {
            if (max < temp.size()) max = temp.size();
            return;
        }
        if (temp.isEmpty() || Math.abs(nums[index] - nums[temp.size()-1]) % k == 0 ) {
            temp.addLast(nums[index]);
            LongestSets(nums, temp, index+1, k);
            temp.removeLast();
        }
        LongestSets(nums, temp, index+1, k);
    }

    private static int minimizeBinary(int n) {
        char[] num = Integer.toBinaryString(n).toCharArray();
        Arrays.sort(num);
        String s = String.copyValueOf(num);
        return Integer.parseInt(s, 2); // ("0011", 2) -> 3
    }

    // subsequence

//    private static int LongestSets(int[] nums, int k) {
//        ArrayList<Integer> list;
//        int maxLength = Integer.MIN_VALUE, sum = 0;
//        for (int i = 0; i < (1 << nums.length); i++) {
//            sum = 0;
//            list = new ArrayList<>();
//            for (int j = 0; j < nums.length; j++) {
//                if ((i & (1 << j)) > 0) {
//                    sum += nums[j];
//                    list.add(nums[j]);
//                }
//            }
//            if (list.size() > maxLength && sum % k == 0) {
//                System.out.println(list);
//                maxLength = list.size();
//            }
//        }
//        return maxLength == Integer.MIN_VALUE ? 0 : maxLength;
//    }

    // subsets
    private static int LongestSequence(String s) {
        for (int i = 0; i < (1 << s.length()); i++) {
            for (int j = 0; j < s.length(); j++) {
                if ((i & (1 << j)) > 0) {
                    System.out.print(s.charAt(j) + " ");
                }
            }
            System.out.println();
        }
        return 0;
    }


    private static int fibonacci(int n) {
        int[] dp = new int[n];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i < n; i++) {
            dp[i] = dp[i-2] + dp[i-1];
        }
        return dp[n-1];
    }

    private static int noOfhouses(int[] nums, int r, int u) {
        if (nums.length == 0) return 0;
        int target = r * u;
        int food = 0;
        for (int i = 0; i < nums.length; i++) {
            food += nums[i];
            if (food >= target) {
                return i+1;
            }
        }
        return -1;
    }


    private static int[] greatest(int[] nums) {
        int index = -1, max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                index = i;
            }
        }
        return new int[]{index, max};
    }

    private static int calculateBinaryOperations(String s) {
        if (s.isEmpty()) return 0;

        int res = s.charAt(0) - '0', i = 1;
        while (i < s.length()) {
            char ch = s.charAt(i);
            if (ch <= '0' || ch >= '9') {
                if (ch == 'C') {
                    res ^= s.charAt(++i) - '0';
                } else if (ch == 'A') {
                    res &= s.charAt(++i) - '0';
                } else {
                    res |= s.charAt(++i) - '0';
                }
            }
            i++;
        }
        return res;
    }

    private static boolean checkpassword(String s) {
        if (s.length() < 4 || Character.isDigit(s.charAt(0))) return false;

        boolean d = false, c = false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '/' || s.charAt(i) == ' ') {
                return false;
            } else if (s.charAt(i) > '0' && s.charAt(i) < '9') {
                d = true;
            } else if (s.charAt(i) > 'A' && s.charAt(i) < 'Z') {
                c = true;
            }
        }
        return c && d ;
    }

    private static int oddevensum(int[] nums) {
        int[] odd = new int[nums.length/2+1];
        int[] even = new int[nums.length/2+1];
        int k = 0;
        for (int i = 0, j = 1; i < nums.length && j < nums.length ; i+=2, j+=2) {
            odd[k] =  nums[i];
            even[k] =  nums[j];
            k++;
        }
        Arrays.sort(odd);
        Arrays.sort(even);
        return odd[odd.length-2] + even[even.length-2];
    }
}
