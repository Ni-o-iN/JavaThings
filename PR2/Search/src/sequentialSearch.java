import java.util.Scanner;

public class sequentialSearch {

    boolean gefunden = false;
    int j;

    //bei dem sequential search wird ein key von beginn bis ende des Arrays gesucht
    public void seqSearch(int[] array, int key) {
        if(array.length == 0) {
            System.out.println("Der Array ist leer.");
        }
        else {
            for(int i = 0; i < array.length; i++) {
                if(array[i] == key) {
                    gefunden = true;
                    j = i+1; //+1, weil wir von 0 beginnen.
                }
            }
            if(gefunden) {
                System.out.println("Die gesuchte Zahl:" + key + " ist an der Stelle " + j);
            }
            else {
                System.out.println("Die gesuchte Zahl ist nicht im Array.");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        sequentialSearch test = new sequentialSearch();

        System.out.println("Wie groß soll der Array sein?");
        int groeße = scanner.nextInt();
        int[] meinArray = new int [groeße];

        for(int i = 0; i < groeße; i++) {
            System.out.println("Welche Zahlen sollen in das Array?");
            int zahl = scanner.nextInt();
            meinArray[i] = zahl;
        }

        System.out.println("Nach welcher Zahl willst du suchen?");
        int key = scanner.nextInt();

        test.seqSearch(meinArray, key);

    }

}
