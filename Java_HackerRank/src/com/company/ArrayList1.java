package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList1 {
    ArrayList1() {
        ArrayList<Integer> AL = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter total number of values :- ");
        int N = input.nextInt();
        System.out.println();
        for (int i = 0; i < N; i++) {
            System.out.print("Enter Value for "+ i +" Index:- ");
            AL.add(input.nextInt());
        }
        System.out.println();
        System.out.print("Enter queries :- ");
        int Q = input.nextInt();
        System.out.println();
        for (int i = 0; i < Q; i++) {
            System.out.print("Enter query name :- ");
            String temp = input.next();
            if (temp.equals("Insert")) {
                System.out.print("Enter Index Value :- ");
                int x = input.nextInt();
                System.out.print("Enter Value :- ");
                int y = input.nextInt();
                AL.add(x, y);
            } else if (temp.equals("Delete")) {
                System.out.print("Enter Index Value :- ");
                int x = input.nextInt();
                AL.remove(x);
            }
        }
        System.out.println("Array List :");
        for (int display : AL) {
            System.out.print(display + " ");
        }
    }
}
