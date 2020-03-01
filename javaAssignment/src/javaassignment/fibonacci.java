/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaassignment;

import java.util.Scanner;

/**
 *
 * @author imrul
 */
public class fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sequence number of fibonacci series : ");
        final int count = input.nextInt();
        System.out.print("0 ");
        for (int i = 1; i <= count; i++) {
            System.out.print(fib(i) + " ");
        }

        System.out.println("...");
    }

     public static long fib(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }
}
