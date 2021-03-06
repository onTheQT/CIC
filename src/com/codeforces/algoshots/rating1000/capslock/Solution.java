package com.codeforces.algoshots.rating1000.capslock;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        StringBuilder sb = new StringBuilder(fs.next());
        char first = sb.charAt(0);
        StringBuilder second = new StringBuilder(sb.substring(1));
        boolean isFirstUpper = Character.isUpperCase(first);
        boolean isSecondUpper = true;
        for (char c : second.toString().toCharArray()) {
            if (Character.isLowerCase(c)) {
                isSecondUpper = false;
                break;
            }
        }
        if (isSecondUpper) {
            for (int i=0; i<second.length(); ++i) {
                second.setCharAt(i, Character.toLowerCase(second.charAt(i)));
            }
            System.out.println((isFirstUpper ?  Character.toLowerCase(first) : Character.toUpperCase(first)) + second.toString());
            return;
        }
        System.out.println(sb.toString());

    }

    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");

        String next() {
            while (!st.hasMoreTokens())
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        int[] readArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = nextInt();
            return a;
        }

        long nextLong() {
            return Long.parseLong(next());
        }
    }
}
