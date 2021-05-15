package com.company.easy.currency_formatter;

import java.io.*;
import java.text.NumberFormat;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        double payment = sc.nextDouble();
        sc.close();

        String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        String india = NumberFormat.getCurrencyInstance(new Locale("en", "IN")).format(payment);
        String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);

        System.out.printf("US: %s\n", us);
        System.out.printf("India: %s\n", india);
        System.out.printf("China: %s\n", china);
        System.out.printf("France: %s\n", france);
    }
}
