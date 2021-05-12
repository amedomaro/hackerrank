package com.company.easy.ifElse;

import java.util.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        if ((n % 2 == 0) && (n > 2 && n < 5) || (n % 2 == 0) && (n > 20)) {  // Solution
            System.out.println("Not Weird");
        } else System.out.print("Weird");

        scanner.close();
    }
}
