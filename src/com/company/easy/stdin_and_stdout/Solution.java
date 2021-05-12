package com.company.easy.stdin_and_stdout;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();
        scan.close();

        System.out.printf("String: %s\n", s);
        System.out.println("Double: " + d);
        System.out.printf("Int: %d\n", i);
    }
}
