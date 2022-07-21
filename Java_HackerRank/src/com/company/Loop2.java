package com.company;

import java.util.Scanner;

public class Loop2 {
    Loop2(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter value of iteration :- ");
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            System.out.println("Enter value of A, B & N :");
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int s1 = 0;
            for(int j=0;j<n;j++)
            {
                if(j==0){
                    s1 += a + (Math.pow(2,j) * b);
                }
                else{
                    s1 += (Math.pow(2,j) * b);
                }
                System.out.print(s1 + " ");
            }
            System.out.println(" ");
        }
        in.close();
    }
}
