package com.company;

import java.util.Scanner;

public class Loop1 {
    Loop1(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value :- ");
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for(int i=1; i<11; i++)
        {
            System.out.println(N + " x " + i + " = " + (N*i));
        }
        scanner.close();
    }
}
