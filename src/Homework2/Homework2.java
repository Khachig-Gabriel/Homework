package Homework2;

public class Homework2 {

    public static void main(String[] args) {

        int a = 4;
        int b = 7;

        if (a > b) {
            System.out.println("First is bigger");
        } else if (a < b) {
            System.out.println("First is smaller");
        } else {
            System.out.println("They are equal");
        }




        char char1 = 'A';
        char char2 = 'B';
        char char3 = 'C';

        if (char1 > char2) {
            System.out.println("A comes last, when arranged in alphabetical order");
        } else if (char2 > char3 ) {
            System.out.println("B comes last, when arranged in alphabetical order");
        } else {
            System.out.println("C comes last, when arranged in alphabetical order");
        }




        Boolean redIsHitFromBehind = false;
        Boolean blackIsHitFromBehind = true;

        if (redIsHitFromBehind && blackIsHitFromBehind) {
            System.out.println("Invalid State");
        } else if (redIsHitFromBehind == true && blackIsHitFromBehind == false) {
            System.out.println("The black car is guilty for the crash");
        } else {
            System.out.println("The red car is guilty for the crash");
        }





    }
}
