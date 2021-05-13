package com.company.easy.end_of_file;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str;
        int count = 1;

        while (scan.hasNextLine()){
            str = scan.nextLine();
            System.out.printf("%d %s\n", count, str);
            count++;
        }
        scan.close();
    }
}