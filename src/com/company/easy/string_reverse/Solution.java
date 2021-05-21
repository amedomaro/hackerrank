package com.company.easy.string_reverse;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        StringBuilder sb = new StringBuilder(a);
        System.out.println(a.equals(sb.reverse().toString()) ? "Yes" : "No");
    }
}
