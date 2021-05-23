package com.company.easy.arraylist;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        List<List<Integer>> externalArray = new ArrayList<>();
        int sizeExternal = scan.nextInt();   // size external array
        int query;   // Number of requests

        for (int i = 0; i < sizeExternal; i++) {   // Save numbers in ArrayList
            List<Integer> internalArray = new ArrayList<>();
            int sizeInternal = scan.nextInt();    // size internal array

            for (int j = 0; j < sizeInternal; j++) {
                internalArray.add(scan.nextInt());
            }
            externalArray.add(internalArray);
        }

        query = scan.nextInt();

        for (int i = 0; i < query; i++) {    // Displaying responses to requests
            int x = scan.nextInt();
            int y = scan.nextInt();

            try {
                System.out.println(externalArray.get(x - 1).get(y - 1));
            } catch (IndexOutOfBoundsException exception) {
                System.out.println("ERROR!");
            }
        }

        scan.close();
    }
}
