import java.util.*;

public class PUE1 {

	/*Gegeben sei die folgende Aufgabe: Lassen Sie den Benutzer ganze Zahlen (int) über die
	Tastatur eingeben. Alle geraden Zahlen, die der Benutzer eingibt, sollen aufsummiert werden.
	Die erste negative Zahl (< 0) beendet die Eingabe. Lassen Sie dann die Gesamtsumme und die
	Anzahl aller eingegeben Zahlen ausgeben. Die letzte Zahl soll dabei nicht mit berücksichtigt
	werden
	*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int zahl = 0;
        int counter = 0;
        int ergebnis = 0;
        System.out.println("Geben Sie Zahlen ein, zum stoppen eine negative Zahl.");
        while (zahl >= 0) {
            zahl = scanner.nextInt();
            if (zahl % 2 == 0) {
                ergebnis += zahl;
            }
            counter += 1;
        }
        counter -= 1;
        System.out.println("Anzahl der Zahlen: " + counter);
        System.out.println("Ergebnis der geraden Zahlen: " + ergebnis);

        scanner.close();
    }
}