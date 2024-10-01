package com.siso.hackerrank;

import java.util.Scanner;

public class Siso {
    public static void main(String[] args) {


        Scanner scanner;
        scanner = new Scanner(System.in);

        int integer = scanner.nextInt();
        double doub = scanner.nextDouble();
        // it is used for to read the white spaces before reading the string value
        scanner.nextLine();
        String string = scanner.nextLine();

        System.out.println("the integer value is:"+integer);
        System.out.println("the double value is:"+doub);
        System.out.println("the String value is:"+string);

    }
}
