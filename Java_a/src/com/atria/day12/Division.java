package com.atria.day12;

import java.io.IOException;

public class Division {
    public static void divide() {
        int a = 6, b = 0, c;

        try {
            c = a / b;  // Will throw ArithmeticException
        } 
        catch (ArrayIndexOutOfBoundsException r) {
            System.out.println(r.getMessage());
        } 
        catch (ArithmeticException f) {
            System.out.println("welcome");  // ✅ This will execute
        } 
        catch (IndexOutOfBoundsException g) {
            System.out.println(g.getMessage());
        } 
        catch (Exception d) {
            System.out.println("hello world");
        }
    }

    public static void main(String[] args) {
        Division.divide();  // ✅ Works now
    }
}