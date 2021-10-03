package homework6;

public class RecursiveMethods {

    public static void main(String[] args) {

        // 1. Calculate the sum of the first 100 numbers.

        int sum = 0;
        for(int i = 0; i <= 100; i++) {
            sum = sum + i;
        }
        System.out.println("The sum of the 1st 100 numbers is : " + sum);


        // 2. Calculate the sum of the first 100 odd numbers.

        int oddSum = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0) {
                oddSum = oddSum + i;
            }
        }
        System.out.println("The sum of the 1st 100 odd numbers is: " + oddSum);
        System.out.println();

        // 3. Calculate the product of the first 20 numbers.


        long factorial;
        factorial = 1;
        for (int i = 1; i <= 20; i++) {
            factorial = factorial * i;
        }
        System.out.println("The factorial of 20 is: " + factorial);
        System.out.println();

        // 4. Calculate the sum of all numbers from 0-100 that are divisible by 3.

        int div3 = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0) {
                div3 = div3 + i;
            }
        }
        System.out.println("The sum of the 1st 100 numbers divisible by 3 is: " + div3);
        System.out.println();
    }
}





