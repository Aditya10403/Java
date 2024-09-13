package com.aditya.programs;

public class StrongPasswordChecker {
    public static void main(String[] args) {
        String password = "a";
        System.out.println(strongPasswordChecker(password));
    }

    private static int strongPasswordChecker(String password) {
        int n = password.length();

        // Check if the password has at least one lowercase, one uppercase, and one digit
        int hasLower = 1, hasUpper = 1, hasDigit = 1;
        for (char c : password.toCharArray()) {
            if (Character.isLowerCase(c)) hasLower = 0;
            if (Character.isUpperCase(c)) hasUpper = 0;
            if (Character.isDigit(c)) hasDigit = 0;
        }

        // Count the missing types
        int missingTypes = hasLower + hasUpper + hasDigit;

        // Count the number of changes needed for repeated characters
        int replace = 0, oneMod = 0, twoMod = 0;
        for (int i = 2; i < n; i++) {
            if (password.charAt(i) == password.charAt(i - 1) && password.charAt(i - 1) == password.charAt(i - 2)) {
                int length = 2;
                while (i < n && password.charAt(i) == password.charAt(i - 1)) {
                    length++;
                    i++;
                }
                replace += length / 3;
                if (length % 3 == 0) oneMod++;
                else if (length % 3 == 1) twoMod++;
            }
        }

        // Case 1: Password is too short
        if (n < 6) return Math.max(6 - n, missingTypes);

        // Case 2: Password is within the allowed length range
        else if (n <= 20) return Math.max(replace, missingTypes);

        // Case 3: Password is too long
        else {
            int deleteCount = n - 20;
            replace -= Math.min(deleteCount, oneMod);
            replace -= Math.min(Math.max(deleteCount - oneMod, 0), twoMod * 2) / 2;
            replace -= Math.max(deleteCount - oneMod - twoMod * 2, 0) / 3;
            return deleteCount + Math.max(replace, missingTypes);
        }
    }

}
