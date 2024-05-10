import java.util.Scanner;

public class quickSort {

    /*bei dem quick sort sucht man sich ein pivot element aus und fügt die kleineren Elemente in dem Array vor dieses pivot Element und die größeren hinter dieses
    der vorgang wird rekursiv weiter geführt, das pivot Element wird falls nicht schon sortiert mit dem letzten größeren Element getauscht und ist somit schon
    sortiert. Danach werden die Bereiche vor und hinter dem pivot genau gleich bearbeitet.*/
    public static void quickSort(int A[], int erstes, int letztes) {

        if(erstes >= letztes) {
            return;
        }

        int pivot = A[letztes];	//unser pivot Element ist das hinterste Element

        int links = erstes;
        int rechts = letztes-1;	//pivot soll nicht geprüft werden

        while(links < rechts) {	//bis das linke und rechte Element auf dem selben Element sitzen

            while(A[links] <= pivot && links < rechts) {	//solange das angeschaute Element kleiner als das pivot Element ist rückt es weiter vor
                links++;
            }

            while(A[rechts] >= pivot && links < rechts) {	//solange das angeschaute Element größer als das pivot Element ist rückt es weiter zurück
                rechts--;
            }

            swap(A, links, rechts);	//das Element links ist kleiner und das rechte ist größer als das pivot Element, deshalb werden diese zwei Elemente getauscht
        }	//das Verfahren geht solange bis das linke und rechte Element auf der selben Stelle sind

        if(links > letztes) {	//jetzt wird das pivot Element mit dem letzten angeschautem Element getauscht, aber nur wenn dieses größer als das pivot Element ist
            swap(A, links, letztes);
        }
        //durch den tausch enstehen nun zwei einzelne bereiche da wir vor dem pivot nur kleinere und hinter ihm nur größere haben

        quickSort(A, erstes, links-1);	//das pivot kann ausgelassen werden da es schon an der richtigen Stelle sitzt
        quickSort(A, links+1, letztes);	//deshalb links-1 und links+1

    }

    private static void swap(int A[], int eins, int zwei) {
        int tmp = A[eins];
        A[eins] = A[zwei];
        A[zwei] = tmp;
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

        quickSort(meinArray, 0, meinArray.length-1);

        print(meinArray);
    }

}
