import java.util.Scanner;

public class mergeSort {

    public static void mergeSort(int A[]) {
        int laenge = A.length;

        if(laenge < 2) {	//Entweder kein Element im Array, oder nur ein Element und ein einzelnes Element kann nicht unsortiert sein.
            return;
        }

        int mitte = laenge/2;
        int ersteHaelfte[] = new int[mitte];
        int zweiteHaelfte[] = new int[A.length-mitte];	//A.length-mitte	löst das Problem, falls der Array eine ungerade Anzahl an Elementen hat.

        for(int i = 0; i < mitte; i++) {	//erstes Array erstellen und füllen
            ersteHaelfte[i] = A[i];
        }
        for(int i = mitte; i < laenge; i++) {	//zweites Array erstellen und füllen
            zweiteHaelfte[i-mitte] = A[i];
        }

        mergeSort(ersteHaelfte);
        mergeSort(zweiteHaelfte);

        merge(A, ersteHaelfte, zweiteHaelfte);
    }

    private static void merge(int A[], int ersteHaelfte[], int zweiteHaelfte[]) {
        int laengeLinks = ersteHaelfte.length;
        int laengeRechts = zweiteHaelfte.length;

        int i = 0, j = 0, k = 0;

        while(i < laengeLinks && j < laengeRechts) {	//wenn in der linken Hälfte das kleinste Element ist wird dieses in das Array vorne eingefügt
            if(ersteHaelfte[i] <= zweiteHaelfte[j]) {
                A[k] = ersteHaelfte[i];
                i++;	//so lange bis i größer der langeLinks ist, das bedeutet alle Zahlen der linken Seite benutzt worden sind
            }
            else {										//wenn in der rechten Hälfte das kleinste Element ist wird dieses in das Array vorne eingefügt
                A[k] = zweiteHaelfte[j];
                j++;	//so lange bis j größer der langeRechts ist, das bedeutet alle Zahlen der rechten Seite benutzt worden sind
            }
            k++;	//egal ob das kleinste Element links oder rechts war es wurde ein Element eingefügt und jetzt suchen wir das passende Element für die nächste Stelle
        }

        //falls die obere while Schleife fertig ist und eine Seie noch nicht abgearbeitet wurde
        while(i < laengeLinks) {	//in diesem Fall wurde die rechte Seite komplett in das Array eingetragen aber die linke Seite noch nicht
            A[k] = ersteHaelfte[i];
            i++;
            k++;
        }

        while(j < laengeRechts) {	//in diesem Fall wurde die rechte Seite komplett in das Array eingetragen aber die linke Seite noch nicht
            A[k] = zweiteHaelfte[j];
            j++;
            k++;
        }
    }

    private static void print(int A[]) {
        for(int i = 0; i < A.length; i++) {
            System.out.println(A[i]);
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wie groß soll der Array sein?");
        int groeße = scanner.nextInt();
        int[] meinArray = new int [groeße];

        for(int i = 0; i < groeße; i++) {
            System.out.println("Welche Zahlen sollen in dem Array sortiert werden?");
            int zahl = scanner.nextInt();
            meinArray[i] = zahl;
        }

        mergeSort(meinArray);

        print(meinArray);

    }

}
