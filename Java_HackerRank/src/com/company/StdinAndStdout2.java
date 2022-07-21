package com.company;

import java.util.Scanner;

public class StdinAndStdout2 {
    StdinAndStdout2() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Int, Double and String Value :");
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();

        System.out.println("Output in reverse order :");
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}