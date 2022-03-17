package com.company;

public class Main {
    public static void main(String[] args) {
    int x;
    int count = 0;
    int sum = 0;
    for (x = 1; x <= 1000; x++) {
        if (x % 3 == 0 && x % 5 == 0) {
            count++;
            sum += x;
            System.out.println(x);

            if (count == 5) {
                System.out.println("Exiting for loop");
                System.out.println(sum);
                break;
                }
            }
        }
    }
}

//Create a for statement using a range of numbers from 1 to 1000 inclusive.
//
//Sum all the numbers that can be divided with both 3 and also with 5.
//
//For those numbers that met the above conditions, print out the number.
//
//break out of the loop once you find 5 numbers that met the above conditions.
//
//After breaking out of the loop print the sum of the numbers that met the above conditions.
//
//Note: Type all code in main method