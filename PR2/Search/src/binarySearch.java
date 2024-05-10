import java.util.Scanner;

public class binarySearch {

    int schluessel;

    //bei dem binary search schauen wir ob unser gesuchter key größer oder kleiner ist als der mitte des Arrays
    //das Verhalten wird wiederholt, in dem die untere oder obere Grenze angepasst wird je nachdem ob der key größer oder kleiner als die mitte war
    public void binarySearch(int[] array, int key) {
        int uG = 0;							//uG = untere Grenze
        int oG = array.length-1;			//oG = obere Grenze
        int schluessel = key;
        boolean gefunden = false;

        while(!gefunden) {
            int mid = uG + oG / 2;
            if(array[mid] == key) {
                System.out.println("Die gesuchte Zahl:" + schluessel + " ist an der Stelle " + mid+1);
                gefunden = true;
            }
            else if(key < array[mid]) {
                oG = mid-1;
            }
            else {
                uG = mid+1;
            }
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        binarySearch test = new binarySearch();

        System.out.println("Wie groß soll der Array sein?");
        int groeße = scanner.nextInt();
        int[] meinArray = new int [groeße];

        for(int i = 0; i < groeße; i++) {
            System.out.println("Welche Zahlen sollen in das Array, die Zahlen müssen größer werden?");
            int zahl = scanner.nextInt();
            meinArray[i] = zahl;
        }

        System.out.println("Nach welcher Zahl willst du suchen?");
        int key = scanner.nextInt();

        test.binarySearch(meinArray, key);
    }

}