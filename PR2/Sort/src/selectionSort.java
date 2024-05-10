import java.util.Scanner;

public class selectionSort {

    public void selectionSort(int [] array) {
        int marker = array.length-1;

        while (marker > 0) {
            int groeßte = 0;
            for(int i = 0; i <= marker; i++) {
                if(array[i] > array[groeßte]) {
                    groeßte = i;
                }
            }
            swap(array, groeßte, marker);
            marker--;
        }
        System.out.println("Das Array wurde sortiert.");
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public void swap(int[] array, int groeßte, int marker) {
        int tmp = array[marker];
        array[marker] = array[groeßte];
        array[groeßte] = tmp;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        selectionSort test = new selectionSort();

        System.out.println("Wie groß soll der Array sein?");
        int groeße = scanner.nextInt();
        int[] meinArray = new int [groeße];

        for(int i = 0; i < groeße; i++) {
            System.out.println("Welche Zahlen sollen in dem Array sortiert werden?");
            int zahl = scanner.nextInt();
            meinArray[i] = zahl;
        }

        test.selectionSort(meinArray);

    }

}
