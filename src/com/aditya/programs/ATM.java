package com.aditya.programs;

import java.util.Arrays;

public class ATM {
    int[] d = { 20, 50, 100, 200, 500 };
    int[] c = new int[5];

    public ATM() {}

    public void deposit(int[] notes) {
        for (int i=0 ; i < 5; i++) {
            c[i] += notes[i];
        }
    }

    public int[] withdraw(int amount) {
        int[] res = new int[5];
        int[] currency = Arrays.copyOf(c, 5);
        int a, b;
        if (amount > total()) return new int[] {-1};

        // 500
        if (amount >= 500) {
            a = amount/500;
            b = c[4] - a;
            if (b >= 0) {
                res[4] = c[4] - b;
                c[4] = b;
                amount -= a*500;
            } else {
                res[4] = c[4];
                c[4] = 0;
            }
        }
        if (amount == 0) return res;

        // 200
        if (amount >= 200) {
            a = amount/200;
            b = c[3] - a;
            if (b >= 0) {
                res[3] = c[3] - b;
                c[3] = b;
                amount -= a*200;
            } else {
                res[3] = c[3];
                c[3] = 0;
            }
        }
        if (amount == 0) return res;

        // 100
        if (amount >= 100) {
            a = amount/100;
            b = c[2] - a;
            if (b >= 0) {
                res[2] = c[2] - b;
                c[2] = b;
                amount -= a*100;
            } else {
                res[2] = c[2];
                c[2] = 0;
            }
        }
        if (amount == 0) return res;

        // 50
        if (amount >= 50) {
            a = amount/50;
            b = c[1] - a;
            if (b >= 0) {
                res[1] = c[1] - b;
                c[1] = b;
                amount -= a*50;
            } else {
                res[1] = c[1];
                c[1] = 0;
            }
        }
        if (amount == 0) return res;

        // 20
        if (amount >= 20) {
            a = amount/20;
            b = c[0] - a;
            if (b >= 0) {
                res[0] = c[0] - b;
                c[0] = b;
                amount -= a*20;
            } else {
                res[0] = c[0] - b;
                c[0] = 0;
            }
        }
        if (amount == 0) return res;
        // Reset
        c = currency;
        return new int[] {-1};
    }

    public int total() {
        int total = 0;
        for (int i=0 ; i < 5; i++) {
            total += c[i] * d[i];
        }
        return total;
    }

    public static void main(String[] args) {
        ATM atm = new ATM();
        int[] c = { 0,0,1,2,1 };
        atm.deposit(c);
        System.out.println(Arrays.toString(atm.withdraw(600)));
        c = new int[] { 0,1,0,1,1 };
        atm.deposit(c);
        System.out.println(Arrays.toString(atm.withdraw(600)));
        System.out.println(Arrays.toString(atm.withdraw(550)));
    }

}


