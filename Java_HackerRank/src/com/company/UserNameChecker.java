package com.company;

import java.util.Scanner;

public class UserNameChecker {
    UserNameChecker() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total entry :- ");
        int n = sc.nextInt();
        char un = '_';

        for (int i = 0; i < n; i++) {
            int count = 0;
            System.out.print("Enter "+ i+1 + " entry :- ");
            String st = sc.next();
            int c = st.charAt(0);
            if (st.length() < 8 || st.length() > 30)
                System.out.println("Invalid");
            else {
                if ((c >= 65 && c <= 90) || (c >= 97 && c <= 122)) {
                    for (int j = 0; j < st.length(); j++) {
                        int a = st.charAt(j);
                        if ((a >= 65 && a <= 90) || (a >= 97 && a <= 122) || (a >= 48 && a <= 57) || (st.charAt(j) == un)) {
                            count++;
                        } else {
                            System.out.println("Invalid");
                        }
                    }
                } else {
                    System.out.println("Invalid");
                }
            }
            if (count == st.length()) {
                System.out.println("Valid");
            }
        }
    }
}
