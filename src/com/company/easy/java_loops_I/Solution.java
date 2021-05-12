package com.company.easy.java_loops_I;

import java.util.*;


public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int result;
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for(int i = 1; i <= 10; i++){
            result = n*i;
            System.out.printf("%d x %d = %d\n", n, i, result);
        }

        scanner.close();
    }
}
