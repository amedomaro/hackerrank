package com.company.easy.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scan = new Scanner(System.in);
        List<Integer> numList = new ArrayList<>();
        String query, buffer, buffer2;
        int count = scan.nextInt();

        while (count-- > 0) {  // list initialization
            numList.add(scan.nextInt());
        }

        count = scan.nextInt(); // get the number of requests

        while (count-- > 0){  // execution of requests
            query = scan.next();

            if (query.equals("Insert")){  // it would be nice to write an index check
                numList.add(scan.nextInt(), scan.nextInt());
            } else if (query.equals("Delete")){
                numList.remove(scan.nextInt());
            }
        }

        numList.forEach(i -> System.out.print(i + " "));

        scan.close();
    }
}
