import java.util.Scanner;

public class insertionSort {

    public void insertionSort(int[] array) {
        for(int i = 1; i < array.length; i++) {
            int j = i;
            int m = array[i];

            while(j > 0 && array[j-1] > m) {
                array[j] = array[j-1];
                j--;
            }
            array[j] = m;
        }
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        insertionSort test = new insertionSort();

        System.out.println("Wie groß soll der Array sein?");
        int groeße = scanner.nextInt();
        int[] meinArray = new int [groeße];

        for(int i = 0; i < groeße; i++) {
            System.out.println("Welche Zahlen sollen in dem Array sortiert werden?");
            int zahl = scanner.nextInt();
            meinArray[i] = zahl;
        }

        test.insertionSort(meinArray);

    }

}
