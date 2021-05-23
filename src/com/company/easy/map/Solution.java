package com.company.easy.map;

//Complete this code or write your own from scratch

import java.util.*;
import java.io.*;

class Solution {

    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        Map<String, Integer> phoneBook = new HashMap<>();
        String name;
        int phone, n = in.nextInt();
        in.nextLine();    // read line break

        for (int i = 0; i < n; i++) {
            name = in.nextLine();
            phone = in.nextInt();
            phoneBook.put(name, phone);
            in.nextLine();
        }
        while (in.hasNext()) {
            String s = in.nextLine();
            if (phoneBook.containsKey(s)) {
                System.out.printf("%s=%d\n", s, phoneBook.get(s));
            } else {
                System.out.println("Not found");
            }
        }

        in.close(); //close scanner
    }
}
