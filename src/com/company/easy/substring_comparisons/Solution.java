package com.company.easy.substring_comparisons;

import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0,k);
        String largest = s.substring(0,k);
        String subString;

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        for(int i = 0; i <= s.length() - k; i++){
            subString = s.substring(i, i + k);
            smallest = smallest.compareTo(subString) < 0 ? smallest : subString;
            largest = largest.compareTo(subString) > 0 ? largest : subString;
        }

        return String.format("%s\n%s", smallest, largest);
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
