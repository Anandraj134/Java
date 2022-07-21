package com.company;

import java.util.Scanner;

public class StdinAndStdout1 {
    StdinAndStdout1() {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter Value :- ");
            int a = scan.nextInt();
            System.out.println("You entered " + a);
        }
    }
}
