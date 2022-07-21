package com.company;

import java.util.Scanner;

public class IfElse {
    IfElse() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Value :- ");
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        if (N % 2 == 0) {
            if (N >= 2 && N <= 5) {
                System.out.println("Not Weird");
            }
            if (N >= 6 && N <= 20) {
                System.out.println("Weird");
            }
            if (N > 20) {
                System.out.println("Not Weird");
            }
        } else {
            System.out.println("Weird");
        }

        scanner.close();
    }
}