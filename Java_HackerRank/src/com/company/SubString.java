package com.company;

import java.util.Scanner;

public class SubString {
    SubString(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter String :- ");
        String S = in.next();
        System.out.print("Enter start index :- ");
        int start = in.nextInt();
        System.out.print("Enter end index :- ");
        int end = in.nextInt();
        String S1 = S.substring(start, end);
        System.out.print("Substring is :- " + S1);
    }
}
