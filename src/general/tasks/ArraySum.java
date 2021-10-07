package general.tasks;

public class ArraySum {
    public static void main(String[] args) {

        /*
        Print the elements that are not divisible by 30
         */

        int arr[] = {40, 60, 30, 50, 80, 100, 70, 90, 120, 180};

        System.out.println("These are the elements not divisible by 30:");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 30 != 0) {
                System.out.println(arr[i]);
            }
        }
        System.out.println();


        //     Recursion: Calculate the sum of all even numbers up to the input number

        int i = 14;
        System.out.println("The sum of all even numbers: " + evensum(i));
    }
    public static int evensum(int number) {
        if (number == 1) return 0;
        int sum = evensum(number - 1);
        if (number % 2 == 0 ) sum += number;
        return sum;
    }
}

