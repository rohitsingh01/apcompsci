package com.company;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner askNumber = new Scanner(System.in);
        System.out.println("Enter a number.");
        int result = askNumber.nextInt();
        int finalResult = fact(result);
        System.out.println(finalResult);
    }

    static int fact(int x) {
        if (x > 0) {
            return (x * fact(x - 1));


        } else {
            return (1);
        }
    }
}












