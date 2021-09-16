package Homework3;

import java.util.Scanner;

public class Homework3 {

    public static void main(String[] args) {

        double number1, number2;
        String operator;
        double result = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your 1st number: ");
        number1 = sc.nextDouble();
        System.out.println("Enter your 2nd number: ");
        number2 = sc.nextDouble();
        System.out.println("Enter the operator in the following way: a - add," +
                " s - subtract, m - multiply, d - divide ");
        operator = sc.next();
        sc.close();

        switch (operator) {
            case "a":
                result = number1 + number2;
                break;
            case "s":
                result = number1 - number2;
                break;
            case "m":
                result = number1 * number2;
                break;
            case "d":
                result = number1 / number2;
                break;
            default:
                System.out.println("Error: Please enter a valid input: a - add, " +
                        "s - subtract, m - multiply, d - divide");
                break;
        }
        System.out.println("The result is: " + result);

    }


}
