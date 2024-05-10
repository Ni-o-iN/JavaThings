import java.util.*;

public class MethodenRechnen {
	
	public static void plus(int a, int b) {
		int c = a + b;
		System.out.println(c);
	}
	
	public static void minus(int a, int b) {
		int c = a - b;
		System.out.println(c);	
	}
	
	public static void mal(int a, int b) {
		int c = a * b;
		System.out.println(c);	
	}
	
	public static void geteilt(int a, int b) {
		int c = a / b;
		System.out.println(c);	
	}
	
	public static void mehrAlsZweiZahlen(int a, int b) {
		Scanner scanner = new Scanner(System.in);
		
		int ergebnis = 0;
		System.out.println("plus, minus, mal oder geteilt?");
		String verfahren = scanner.next();
		if(verfahren.equals("plus")) {
			ergebnis = a + b;
			System.out.println(a + " + " + b + " = " + ergebnis);
		} else if (verfahren.equals("minus")) {
			ergebnis = a - b;
			System.out.println(a + " - " + b + " = " + ergebnis);
		} else if (verfahren.equals("mal")) {
			ergebnis = a * b;
			System.out.println(a + " * " + b + " = " + ergebnis);
		} else if (verfahren.equals("geteilt")) {
			ergebnis = a / b;
			System.out.println(a + " / " + b + " = " + ergebnis);
		}
		
		System.out.println("Mit welcher Zahl m�chten Sie mit dem Ergebnis weiter rechnen");
		int weitereZahl = scanner.nextInt();
		mehrAlsZweiZahlen(ergebnis, weitereZahl);
		
		scanner.close();
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Reichen Ihnen zwei Zahlen zum Rechnen?");
		String antwort = scanner.next();
		if(antwort.equals("ja")) {
			System.out.println("Geben Sie zwei Zahlen ein mit denen Sie rechnen wollen.");
			System.out.print("Erste Zahl: ");
			int ersteZahl = scanner.nextInt();
			System.out.print("Zweite Zahl: ");
			int zweiteZahl = scanner.nextInt();
			
			System.out.println("Welches Verrfahren m�chten sie benutzen?");
			System.out.println("plus, minus, mal oder geteilt?");
			String verfahren = scanner.next();
			if(verfahren.equals("plus")) {
				plus(ersteZahl, zweiteZahl);
			} else if (verfahren.equals("minus")) {
				minus(ersteZahl, zweiteZahl);
			} else if (verfahren.equals("mal")) {
				mal(ersteZahl, zweiteZahl);
			} else if (verfahren.equals("geteilt")) {
				geteilt(ersteZahl, zweiteZahl);
			}
		} else if(antwort.equals("nein")) {
			System.out.println("Geben Sie vorerst zwei Zahlen ein mit denen Sie rechnen wollen.");
			System.out.print("Erste Zahl: ");
			int ersteZahl = scanner.nextInt();
			System.out.print("Zweite Zahl: ");
			int zweiteZahl = scanner.nextInt();
			mehrAlsZweiZahlen(ersteZahl, zweiteZahl);
		}
				
		scanner.close();
	}

}
