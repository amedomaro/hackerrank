package com.company.easy.anagrams;

import java.util.*;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        a = a.toLowerCase();
        StringBuilder sb = new StringBuilder(b.toLowerCase());
        boolean flag = false;

        if (a.length() == b.length()) {

            for (int i = 0; i < a.length(); i++) {
                for (int j = 0; j < sb.length(); j++) {

                    if (a.charAt(i) == sb.charAt(j)) {
                        sb.deleteCharAt(j);
                    }
                    if (sb.length() == 0) {
                        flag = (i == a.length() - 1);
                    }
                }
            }
        }
        return flag;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
