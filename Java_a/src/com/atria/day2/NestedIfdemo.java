package com.atria.day2;

import java.util.Scanner; // Moved this line to the top

public class NestedIfdemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input values
        System.out.print("Enter a: ");
        int a = sc.nextInt();

        System.out.print("Enter b: ");
        int b = sc.nextInt();

        System.out.print("Enter c: ");
        int c = sc.nextInt();

        // Simple nested if
        if (b > a) {
            if (b > c) {
                System.out.println("b is the largest");
            }
        }

        sc.close();
    }
}
