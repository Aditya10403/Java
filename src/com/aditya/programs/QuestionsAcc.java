package com.aditya.programs;

import java.util.*;
import java.util.stream.Collectors;


public class QuestionsAcc {
//    static int max = Integer.MIN_VALUE;
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

//        String s = "abaabbcc";
//        System.out.println(stringtransform(s));

//        String s = "naman";
//        System.out.println(ispalindrome(s));

//        String s = "cxbxd";
//        System.out.println(longestpalindromesubstring(s));

//        int[] nums = { 4, 5, 2, 25 };
//        System.out.println(Arrays.toString(nextGreatest(nums)));

//        int[] nums = { 1, 0, 1, 1, 1, 0, 0};
//        System.out.println(equalnoof0and1(nums));

//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        System.out.println((a / b) + (a % b));

//        int[][] obstacleGrid = {{ 0,0,0 }, { 0,1,0 },  { 0,0,0 }};
//        System.out.println(uniquePathsWithObstacles(obstacleGrid));

//        int[] nums = { 1,2,3 };
//        System.out.println(subarraySum(nums, 3));

//        int[] nums = { 1, 3, 5, 7, 3 };
//        System.out.println(arrayEquilibrium(nums));

//        String s = "A0_1fg";
//        System.out.println(checkpassword(s));

//        String s = "1C0C1C1A0B1";
//        System.out.println(OperationsBinary(s));

//        int[] nums = { 1,2,3 };
//        System.out.println(longestsubsequence(nums, -7));

//        int[] nums = { 1, 2, 3, 4, 5 };
//        System.out.println(minSubArrayLen(11, nums));

//        String s = "9999900000";
//        System.out.println(CountpalidromeSubsequence(s));

//        TreeNode root = new TreeNode();
//        System.out.println(pathSum(root, 8));
//        int r = 3, n = 4;
//        int answer = 4/2 + (2*5 + (4-1)*3);
//        System.out.println(answer);

//        int[] nums = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
//        System.out.println(primeSum(nums));

        int D = 5;
        int a = (int) (3.14 * Math.pow(D, 2));
        System.out.println(a);

    }

    private static int primeSum(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0, sum = 0;
        while (i < nums.length) {
            if (isPrime(i)) sum += nums[i];
            i++;
        }
        return sum;
    }

    private static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }


    public static int pathSum(TreeNode root, int target) {
        HashMap<Long, Integer> map = new HashMap<>();
        return pathSum(root, target, 0, map);
    }

    private static int pathSum(TreeNode root, int target, long sum, HashMap<Long, Integer> map) {
        if (root == null) return 0;
        sum += root.val;
        int res = map.getOrDefault(sum - target, 0);
        if (sum == target) res++;
        map.put(sum, map.getOrDefault(sum, 0) + 1);
        res += pathSum(root.left, target, sum, map) + pathSum(root.right, target, sum, map);
        map.put(sum, map.get(sum) - 1);
        return res;
    }

    private static int CountpalidromeSubsequence(String s) {
        int[][] dp = new int[s.length()][s.length()];
        for (int i = 0; i < s.length(); i++) {
            Arrays.fill(dp[i], -1);
        }
        return helper(s, 0, s.length()-1, dp);
    }

    private static int helper(String s, int i, int j, int[][] dp) {
        if (i == j) return 1;
        if (i > j || j-i < 5) return 0;
        if (dp[i][j] != -1) return dp[i][j];
        if (s.charAt(i) == s.charAt(j)) {
            return dp[i][j] = 1 + helper(s, i+1, j, dp) + helper(s, i, j-1, dp);
        } else {
            int l = helper(s, i+1, j, dp);
            int r = helper(s, i, j-1, dp);
            return dp[i][j] = l + r - helper(s, i+1, j-1, dp);
        }
    }

    private static int minSubArrayLen(int target, int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0, j = 0, sum = 0, minLength = Integer.MAX_VALUE;
        while (i < nums.length) {
            sum += nums[i++];
            while (sum >= target) {
                minLength = Math.min(minLength, i - j);
                sum -= nums[j++];
            }
        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }


    private static int longestsubsequence(int[] nums, int goal) {
        Set<Integer> allSum = new HashSet<>();
        allSum.add(0);
        for (int num: nums) {
            Set<Integer> currentSum = new HashSet<>(allSum);
            for (int sum: allSum) {
                currentSum.add(sum + num);
            }
            allSum = currentSum;
        }
        int res = Integer.MAX_VALUE;
        for (int num: allSum) {
            res = Math.min(res, Math.abs(num - goal));
        }
        return res;
    }

    private static int OperationsBinary(String s) {
        if (s.isEmpty()) return 0;
        int i = 0, res = 0;
        while (i <  s.length()) {
            char c = s.charAt(i);
            if (c <= '0' || c >= '9') {
                if (c == 'A') res &= s.charAt(++i) - '0';
                else if (c == 'B') res |= s.charAt(++i) - '0';
                else res ^= s.charAt(++i) - '0';
            }
            i++;
        }
        return res;
    }

    private static boolean checkpassword(String s) {
        if (Character.isDigit(s.charAt(0)) || s.length() < 4) return false;

        boolean isCapital = false, isNumeric = false;
        char[] charArray = s.toCharArray();
        for (char c: charArray) {
            if (String.valueOf(c).equals(" ") || String.valueOf(c).equals("/")) return false;
            else if (c >= '0' && c <= '9') isNumeric = true;
            else if (c >= 'A' && c <= 'Z') isCapital = true;
        }
        return isCapital && isNumeric;
    }

    private static int arrayEquilibrium(int[] nums) {
        int sum = 0;
        for (int num: nums) {
            sum += num;
        }
        sum = sum / 2;
        int i = 0;
        while (sum != 0) {
            sum -= nums[i];
            i++;
        }
        return i != 0 ? i : -1;
    }

    private static int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int sum = 0, count = 0;
        for (int num: nums) {
            sum += num;
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }

    private static int equalnoof0and1(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        int maxLength = 0;
        int sum = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            sum += nums[i] == 1 ? 1 : -1;
            if (map.containsKey(sum)) {
                int start = map.get(sum);
                maxLength = Math.max(maxLength, i - start);
            } else {
                map.put(sum, i);
            }
        }
        return maxLength;
    }

    private static int uniquePathsWithObstacles(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0 || grid[0][0] == 1) return 0;
        int n = grid[0].length;
        int[] previous = new int[n];
        int[] current = new int[n];
        previous[0] = 1;
        for (int[] num : grid) {
            current[0] = num[0] == 1 ? 0 : previous[0];
            for (int j = 1; j < n; j++) {
                current[j] = num[j] == 1 ? 0 : current[j - 1] + previous[j];
            }
            previous = Arrays.copyOfRange(current, 0, n);
        }
        return previous[n-1];
    }

//    private static int equalnoof0and1(int[] nums) {
//        int maxLength = Integer.MIN_VALUE;
//        int n = nums.length;
//        ArrayList<Integer> list;
//        for (int i = 0; i < (1 << n); i++) {
//            list = new ArrayList<>();
//            for (int j = 0; j < n; j++) {
//                if ((i & (1 << j)) > 0) {
//                    list.add(nums[j]);
//                }
//            }
//            System.out.println(list);
//            int zeroes = 0;
//            int ones = 0;
//            for (int no: list) {
//                if (no == 0) zeroes++;
//                else ones++;
//            }
//            if (zeroes == ones && list.size() > maxLength) {
//                maxLength = list.size();
//            }
//        }
//        return maxLength;
//    }

    private static int[] nextGreatest(int[] nums) {
        if (nums.length == 0) return nums;
        int n = nums.length;
        int[] res = new int[n];
        Stack<Integer> stack = new Stack<>();
        for (int i = n-1; i >= 0; i--) {
            if (stack.isEmpty()) {
                res[i] = -1;
            } else if (stack.peek() > nums[i])  {
                res[i] = stack.peek();
            } else {
                while (!stack.isEmpty() && stack.peek() <= nums[i]) {
                    stack.pop();
                }
                if (stack.isEmpty()) res[i] = -1;
                else res[i] = stack.peek();
            }
            stack.push(nums[i]);
        }
        return res;
    }

    private static String longestpalindromesubstring(String s) {
        if (s.length() <= 1) return s;
        int maxLength = 1;
        int n = s.length(), left, right, start = 0;

        for (int i = 0; i < n; i++) {
            left = right = i;
            while (left >= 0 && right < n && s.charAt(left) == s.charAt(right)) {
                left--;
                right++;
            }
            int length = right - left - 1;
            if (length > maxLength) {
                maxLength = length;
                start = left + 1;
            }

            left = i;
            right = i + 1;
            while (left >= 0 && right < n && s.charAt(left) == s.charAt(right)) {
                left--;
                right++;
            }
            length = right - left - 1;
            if (length > maxLength) {
                maxLength = length;
                start = left + 1;
            }
        }

        return s.substring(start, start + maxLength);
    }

    private static boolean ispalindrome(String s) {
        int i = 0, j = s.length()-1;
        while (i <= j) {
            if (s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
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

    public static int max = Integer.MIN_VALUE;
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

//    private static boolean checkpassword(String s) {
//        if (s.length() < 4 || Character.isDigit(s.charAt(0))) return false;
//
//        boolean d = false, c = false;
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) == '/' || s.charAt(i) == ' ') {
//                return false;
//            } else if (s.charAt(i) > '0' && s.charAt(i) < '9') {
//                d = true;
//            } else if (s.charAt(i) > 'A' && s.charAt(i) < 'Z') {
//                c = true;
//            }
//        }
//        return c && d ;
//    }

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
