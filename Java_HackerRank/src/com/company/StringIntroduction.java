package com.company;

import java.util.Scanner;

public class StringIntroduction {
    StringIntroduction() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String 1 :- ");
        String A = sc.next();
        System.out.println("Enter String 2 :- ");
        String B = sc.next();
        System.out.println(A.length() + B.length());
        int j = 0, i = 0;
        for (i = 0; i < A.length(); ) {
            if (A.charAt(i) < B.charAt(i)) {
                System.out.println("No");
                i++;
                break;
            } else if (A.charAt(i) == B.charAt(i)) {
                j++;
                i++;
            } else {
                System.out.println("Yes");
                i++;
                break;
            }
        }
        if (i == j) {
            System.out.println("No");
        }
        String output = A.substring(0, 1).toUpperCase() + A.substring(1) + " " + B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println(output);
    }
}
