package com.practise;

public class Normal {

    public static void main(String[] args) {
        System.out.println("1");
        try {
            System.out.println("2");
            int a = 10, b = 2, c = 0;
            System.out.println("3");
            c = a / b; // Changed from c = a / c to c = a / b
            System.out.println("4");
            System.out.println(c);
            
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("5");
            System.out.println(c); // Corrected to print the value of variable c
            System.out.println("6");
            // TODO: handle exception
        }
        System.out.println("Railworld");
    }
}
