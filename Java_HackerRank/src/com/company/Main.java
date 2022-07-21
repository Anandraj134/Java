package com.company;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=======================");
        System.out.println("1. Welcome to Java");
        System.out.println("2. Stdin & stdout 1");
        System.out.println("3. If-Else");
        System.out.println("4. Stdin & stdout 2");
        System.out.println("5. Output Formatting");
        System.out.println("6. Loops 1");
        System.out.println("7. Loops 2");
        System.out.println("8. Datatypes");
        System.out.println("9. Currency Formatter");
        System.out.println("10. Sub String");
        System.out.println("11. ArrayList");
        System.out.println("12. User Name Checker");
        System.out.println("-----------------------");
        System.out.print("Enter your choice :- ");
        int choice = input.nextInt();
        System.out.println("=======================");
        System.out.println();
        switch (choice) {
            case 1 -> new WelcomeToJava();
            case 2 -> new StdinAndStdout1();
            case 3 -> new IfElse();
            case 4 -> new StdinAndStdout2();
            case 5 -> new OutputFormatting();
            case 6 -> new Loop1();
            case 7 -> new Loop2();
            case 8 -> new Datatypes();
            case 9 -> new CurrencyFormatter();
            case 10 -> new SubString();
            case 11 -> new ArrayList1();
            case 12 -> new UserNameChecker();
            default -> System.out.println("Invalid Choice");
        }
    }
}

