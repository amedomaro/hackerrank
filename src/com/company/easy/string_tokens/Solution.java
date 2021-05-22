package com.company.easy.string_tokens;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.

        StringBuilder str = new StringBuilder();
        List<String> list = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {

            if (Character.isLetter(s.charAt(i))) {
                str.append(s.charAt(i));
            } else if (str.length() != 0) {
                list.add(str.toString());
                str.delete(0, str.length());
            }
        }

        if (str.length() > 0 && !str.toString().equals(list.get(list.size()-1))){ // Check str
            list.add(str.toString());
        }

        System.out.println(list.size());
        list.forEach(System.out::println);

        scan.close();
    }
}
