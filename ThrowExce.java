package com.practise;

public class ThrowExce {
    public static void main(String[] args) {
        int age = 32;
        if (age < 18) {
            throw new YoungerAge("Vikash, you are not eligible for marriage.");
        } else {
            System.out.println("Vikash, you are eligible for marriage.");
        }
    }
}
