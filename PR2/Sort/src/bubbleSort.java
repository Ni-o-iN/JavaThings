import java.util.Scanner;

public class bubbleSort {

    public void bubbleSort(int A[]) {
        for(int i = 0; i < A.length-1; i++) {
            for(int j = 0; j < A.length-i-1; j++) {
                if(A[j] > A[j+1]) {
                    int tmp = A[j];
                    A[j] = A[j+1];
                    A[j+1] = tmp;
                }
            }
        }
        for(int i = 0; i < A.length; i++) {
            System.out.println(A[i]);
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        bubbleSort test = new bubbleSort();

        System.out.println("Wie groß soll der Array sein?");
        int groeße = scanner.nextInt();
        int[] meinArray = new int [groeße];

        for(int i = 0; i < groeße; i++) {
            System.out.println("Welche Zahlen sollen in dem Array sortiert werden?");
            int zahl = scanner.nextInt();
            meinArray[i] = zahl;
        }

        test.bubbleSort(meinArray);
    }
}