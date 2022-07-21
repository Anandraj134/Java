package com.company;

import java.util.Scanner;

public class EndOfFile {
    EndOfFile(){
        Scanner scan = new Scanner(System.in);
        int i=1;
        System.out.println("Enter String : ");
        while (scan.hasNext())
        {
            String s1 = scan.nextLine();
            System.out.println(i + " " + s1);
            i++;
        }
    }
}
