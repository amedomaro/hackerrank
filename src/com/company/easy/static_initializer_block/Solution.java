package com.company.easy.static_initializer_block;

import java.util.*;

public class Solution {

    //Write your code here
    static int b, h;
    static boolean flag;
    static Scanner scan = new Scanner(System.in);

    static {
        b = scan.nextInt();
        h = scan.nextInt();
        flag = b > 0 && h > 0;
        if (!flag) System.out.println("java.lang.Exception: Breadth and height must be positive");
    }


    public static void main(String[] args) {
        if (flag) {
            int area = b * h;
            System.out.print(area);
        }
//        else {
//            System.out.println("java.lang.Exception: Breadth and height must be positive");
//        }
    }//end of main

}//end of class
