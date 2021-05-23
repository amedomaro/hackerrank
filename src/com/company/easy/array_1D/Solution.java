package com.company.easy.array_1D;

import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];

        a = Arrays.stream(a).map(i -> scan.nextInt()).toArray();
        Arrays.stream(a).forEach(System.out::println);

        scan.close();
    }
}
