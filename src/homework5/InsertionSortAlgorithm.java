package homework5;

public class InsertionSortAlgorithm {
    public static void main(String[] args) {

        int[] array = new int[15];

        for (int a = 0; a < array.length; a++) {
            array[a] = (int) (Math.random() * 20);
            System.out.print("Unsorted array: ");
            System.out.println(array[a]); }

        int tmp;

        int a = array.length - 1;
        while (a >= 0) {
            int lastValue = array[a];
            int arrayElement = a;
            int j = a - 1;

            while (j >= 0) {
                if (array[j] > lastValue) {
                    lastValue = array[j];
                    arrayElement = j; }
                j--; }

            tmp = array[a];
            array[a] = lastValue;
            array[arrayElement] = tmp;
            a--;
        }
        System.out.println();
        System.out.println("Sorted Arrays");
        for (int j = 0; j < array.length; j++) {
            System.out.println("Array [" + j + "] = " + array[j]); } }
        }
