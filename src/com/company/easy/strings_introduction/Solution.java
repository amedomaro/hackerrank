package com.company.easy.strings_introduction;

import java.util.*;

public class Solution {

    private static String upFirstLetter(String str) {
        if (str == null || str.length() == 0) return "";
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        /* Enter your code here. Print output to STDOUT. */

        System.out.println(a.length() + b.length());
        System.out.println(a.compareTo(b) > 0 ? "Yes" : "No");
        System.out.println(upFirstLetter(a) + " " + upFirstLetter(b));

    }
}
