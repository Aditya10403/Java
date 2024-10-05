package com.aditya.programs;

import java.util.*;

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

//        int D = 5;
//        int a = (int) (3.14 * Math.pow(D, 2));
//        System.out.println(a);

//        String s = "10111011";
//        System.out.println(stringDecoder(s));

//        String s = "aits rsms";
//        System.out.println(replace(s, 'a', 's'));

//        int[] nums = { 1,2,3,3,4,4 };
//        System.out.println(secondLargest(nums));

//        String s = "dfa12321afd";
//        System.out.println(secondHighest(s));

//        String s = "snakewatergunwater";
//        System.out.println(SWG(s));

//        int n = 5;
//        System.out.println(n + "th element -> " + specialFibonacci(n));

//        int n = 15, c = 0;
//        while (n > 0) {
//            c += n & 1;
//            n >>= 1;
//        }
//        System.out.println(c);

//        String goals = "TeamA TeamB TeamA TeamA TeamB TeamA";
//        System.out.println(winningTeam(goals));

//        String s = "applesarefallingfromtheskies";
//        System.out.println(deleteVowels(s));

//        int n = 19;
//        System.out.println(isHappy(n));

//        int a = 20, b = 30;
//        System.out.println(LCM(a, b));
//        System.out.println(GCD(a, b));

        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter month: ");
//        int m = sc.nextInt();
//        Season(m);

//        System.out.print("Enter no of Tickets: ");
//        int t = sc.nextInt();
//        total(t);

//        System.out.print("Enter the positive integer: ");
//        int n = sc.nextInt();
//        factors(n);

//        String s = "XYXXYXXY";
//        System.out.println(minimumRemovals(s));

//        int n = 112;
//        System.out.println(getCount(n));

//        int[] nums = { 8, 7, 1, 6, 5, 9 };
//        System.out.println(Arrays.toString(rearrange(nums)));

//        int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
//        System.out.println(subarraySum2(nums));

        int[] nums1 = { 1, 3 }, nums2 = { 2 };
        System.out.println(findMedianSortedArrays(nums1, nums2));

    }

    private static double findMedianSortedArrays(int[] a, int[] b) {
        // MERGE SORT
        int n = a.length, m = b.length;
        int i = 0, j = 0, k = 0;
        int l = m+n;
        int[] merge = new int[l];
        while (i < n && j < m && k != l/2+1) {
            if (a[i] <= b[j]) merge[k++] = a[i++];
            else merge[k++] = b[j++];
        }
        while (i < n && k != l/2+1) merge[k++] = a[i++];
        while (j < m && k != l/2+1) merge[k++] = b[j++];
        System.out.println(k);
        System.out.println(Arrays.toString(merge));
        double ans;
        if (l % 2 == 0) {
            ans = (double) (merge[k - 2] + merge[k-1]) / 2;
        } else ans = merge[k-1];
        return ans;
    }

    private static int subarraySum2(int[] nums) {
        // KADANE'S ALGO
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int num : nums) {
            sum += num;
            max = Math.max(max, sum);
            if (sum < 0) sum = 0;
        }
        return max;
    }

    private static int[] rearrange(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        Arrays.sort(nums);
        int idx = 0;
        for (int i = 0; i < n/2; i++) {
            res[idx++] = nums[i];
        }
        for (int i = n - 1; i >= n/2; i--) {
            res[idx++] = nums[i];
        }
        return res;
    }

    private static int getCount(int n) {
        int count = 0;
        for (int m = 1; m <= n; m++) {
            int starSum = getStarSum(m);
            count += starSum > n ? 1 : 0;
        }
        return count;
    }

    private static int getStarSum(int m) {
        String num = String.valueOf(m);
        int starSum = 0;
        for (int i = 1; i <= num.length(); i++) {
            String prefix = num.substring(0, i);
            starSum += Integer.parseInt(prefix);
        }
        return starSum;
    }

    private static int minimumRemovals(String s) {
        if (s.isEmpty()) return 0;
        int removals = 0;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i-1)) removals++;
        }
        return removals;
    }

    private static void factors(int n) {
        if (n == 0) {
            System.out.println("No Factors");
            return;
        }
        if (n < 0) n = n * -1;
        ArrayList<Integer> factors = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) factors.add(i);
        }
        System.out.print("Factors of " + n + " are: " + factors);

    }

    private static void total(int t) {
        if (t < 5 || t > 40) {
            System.out.print("Minimum 5 and a maximum of 40 tickets should be purchased");
            return;
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Do you want to purchase any refreshments: ");
        String ref = sc.next();
        System.out.print("Do you have any coupon code: ");
        String coupon = sc.next();
        System.out.print("Enter the circle: ");
        String c = sc.next();

        double cost = 0.0;
        cost += c.equals("A") ? t * 150 : t * 75;
        cost -= t > 20 ? 0.1 * cost : 0;
        cost -= coupon.equals("y") ? 0.02 * cost : 0;
        cost += ref.equals("y") ? t * 50 : 0;

        System.out.println("Total Ticket Cost: " + cost);
    }

    private static void Season(int m) {
        switch (m) {
            case 12: case 1: case 2:
                System.out.println("Season: Winter");
                break;
            case 3: case 4: case 5:
                System.out.println("Season: Spring");
                break;
            case 6: case 7: case 8:
                System.out.println("Season: Summer");
                break;
            case 9: case 10: case 11:
                System.out.println("Season: Autumn");
                break;
            default:
                System.out.println("Invalid Month Entered");
                break;
        }
    }

    //  HCF
    private static int GCD(int a, int b) {
        if (b == 0) return a;
        return GCD(b, a % b);
    }

    // LCM
    private static int LCM(int a, int b) {
        return (a * b) / GCD(a, b);
    }

    // LL - FAST AND SLOW POINTER(FUNC)
    private static boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        do {
            slow = sum(slow);
            fast = sum(sum(fast));
        } while (slow != fast);
        return slow == 1;
    }

    private static int sum(int n) {
        int res = 0;
        while (n > 0) {
            int r = n % 10;
            res += r * r;
            n /= 10;
        }
        return res;
    }

    private static String deleteVowels(String s) {
        StringBuilder res = new StringBuilder();
        char[] c = s.toCharArray();
        int n = c.length;
        res.append(c[0]);
        for (int i = 1; i < n-1; i++) {
            if (isVowel(c[i]) && !isVowel(c[i-1]) && !isVowel(c[i+1])) continue;
            res.append(c[i]);
        }
        return res.toString() + c[n-1];
    }

    static Set<Character> set = new HashSet<>(Arrays.asList('a','e','i','o','u'));
    private static boolean isVowel(char b) {
        return set.contains(b);
    }

    private static String winningTeam(String g) {
        if (g.isEmpty()) return "NoTeams";
        int a = 0, b = 0, i = 4;
        while (i < g.length()) {
            if (g.charAt(i) == 'A') a++;
            else b++;
            i += 6;
        }
//        String[] goals = g.split(" ");
//        for (String s: goals) {
//            if (s.equals("TeamA")) a++;
//            else b++;
//        }
        System.out.println(a + " - A : B - " + b);
        return a > b ? "TeamA" : "TeamB";
    }

    private static int specialFibonacci(int n) {
        int[] dp = new int[n];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i < n; i++) {
            dp[i] = (dp[i-1] * dp[i-1]) + (dp[i-2] * dp[i-2]);
        }
        for (int num : dp) {
            System.out.print(num + " ");
        }
        System.out.println();
        return dp[n-1];
    }

    static int A = 0, B = 0;
    private static Character SWG(String s) {
        int a = 0, b = 0;
        int i = 0, j = 1;
        while (i < s.length()) {
            char ch = s.charAt(i);
            if (ch == 's') {
                winner(ch, s.charAt(i+5));
                i = i + 5;
            } else if (s.charAt(i) == 'w') {
                winner(ch, s.charAt(i+5));
                i = i + 5;
            } else {
                winner(ch, s.charAt(i+3));
                i = i + 3;
            }
        }
        return A > B ? 'A' : 'B';
    }

    public static void winner(char a, char b) {
        if (a == b) return;
        if (a == 's') {
            if (b == 'w') A++; else B++;
        } else if (a == 'g') {
            if (b == 's') A++; else B++;
        } else {
            if (b == 'g') A++; else B++;
        }
    }

    private static int secondHighest(String s) {
        if (s.isEmpty()) return -1;
        char[] c = s.toCharArray();
        Arrays.sort(c);
        int i = c.length-1;
        while (i >= 0 && c[i] >= 'a' && c[i] <= 'z') i--;
        if (i < 0) return -1;
        int max = c[i];
        while (i >= 0 && c[i] == max) i--;
        if (i < 0) return -1;
        int secondMax = c[i];
        return secondMax - '0';
    }

    private static int secondLargest(int[] nums) {
        int max = nums[nums.length-1];
        int secondMax = Integer.MIN_VALUE;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (num >= secondMax && num < max) {
                secondMax = num;
                map.put(secondMax, map.getOrDefault(secondMax, 0) + 1);
            }
        }
        return map.getOrDefault(secondMax, 0);
    }

    private static String replace(String s, char a, char b) {
        if (s.isEmpty()) return "";
        char[] c = s.toCharArray();
        StringBuilder ans = new StringBuilder();
        for (char ch : c) {
            if (ch == a) ans.append(b);
            else if (ch == b) ans.append(a);
            else ans.append(ch);
        }
        return ans.toString();
    }

    private static String stringDecoder(String s) {
        if (s.isEmpty()) return "";
        Map<String, Character> map = new HashMap<>();
        StringBuilder ones = new StringBuilder();
        StringBuilder decoded = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            ones.append("1");
            map.put(ones.toString(), (char) ('A' + i));
        }
        String[] arr = s.split("0");
        for (String val: arr) {
            decoded.append(map.get(val)).append(" ");
        }
        return decoded.toString();
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
            if (c == ' ' || c == '/') return false;
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
        String s = new String(num);
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
