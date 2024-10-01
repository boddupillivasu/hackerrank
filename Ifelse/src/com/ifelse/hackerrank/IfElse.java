package com.ifelse.hackerrank;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner scanner;
        scanner  = new Scanner(System.in);
        int num = scanner.nextInt();


        if (num%2 == 1){
            System.out.println("Weird");
        }else {
            if (num >=2 && num <=5){
                System.out.println(" Not Weird");

            } else if (num>= 6 && num <=20) {
                System.out.println("Weird");

            } else if (num >20) {
                System.out.println("Not Weird");

            }
        }
    }
}
