package homework4;

import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {

        /*
        Calculating the arithmetic average of all the even numbers up until the input number
         */

        Scanner inputNumber = new Scanner(System.in);
        System.out.println("Enter a number");

        int randomNumber = inputNumber.nextInt();
        int i = 0, count = 0, arithmetic = 0;

        while (i <= randomNumber) {
            if (i % 2 == 0) {
                arithmetic += i;
                count++;
            }
            i++;
        }
        System.out.println("The arithmetic average of all the even numbers is: " + arithmetic/count);
        System.out.println();


        /*
        Printing first 16 numbers that are divisible by 3
         */

        int a = 16;
        System.out.println("The first 16 numbers that are divisible by 3: (below)");

        for (int j = 0; j <= a; j++) {
            if (j % 3 == 0) {
                continue;
            }
            System.out.println(j);
        }
        System.out.println();



        /*
        Print the sum of 5 input numbers
         */
        System.out.println("Calculating 5 random numbers");

        int fiveNumbers;
        int c = 1; int sum = 0;
        System.out.println("Enter 5 numbers of your choice");

        do {
            fiveNumbers = inputNumber.nextInt();
            sum += fiveNumbers;
            c++;
        }
        while (c <= 5);
        System.out.println("The summary of the input numbers is : " + sum);
        System.out.println();



        /*
         Printing the cube of each number up until the input  number
         */

        System.out.println("Enter a number (To calculate the cube of each number up until that number)");
        int cube = inputNumber.nextInt();
        for (int d = 1; d < cube; d++) {
            System.out.println("The cube of " + d + " is: " + (d*d*d));
        }
    }
}
