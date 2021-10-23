package homework7;

public class Homework7 {
    public static void main(String[] args) {

        /*
        Create 2 two-dimensional arrays (matrices), then create 3rd matrix each element of which is the sum of
         corresponding elements in previous 2 matrices.
         */

        int [][] arr1 = { {10, 85, 96},
                          {20, 14, 30}
        };
        int [][] arr2 = { {12, 21, 8},
                          {14, 36, 48}
        };

        /*
        Printing the values of the 1st array
         */

        System.out.println("Elements of arr1:");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Row " + i);
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print("{" + arr1[i][j] + "}," + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("--------------------");
        System.out.println();


        /*
        Printing the values of the 2nd array
         */

        System.out.println("Elements of arr2:");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("Row " + i);
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print("{" + arr2[i][j] + "}," + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("--------------------");
        System.out.println();

        /*
        Printing out the values of the matrices in the following format
         */

        System.out.println("The sum of the elements:");
        int sum[][] = new int[2][3];
        for (int i = 0; i < 2; i++) {
            System.out.println("Row " + i);
            for (int j = 0; j < 3; j++) {
                sum[i][j] = arr1[i][j] + arr2[i][j];
                System.out.print("{" + sum[i][j] + "}," + " ");
            }
        }
        }
        }


