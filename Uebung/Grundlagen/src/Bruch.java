public class Bruch {
	
	long zaehler;
	long nenner;
	long ganzZahl;
	long nennerWennGanzzahl = 1;
	
	Bruch(long zaehler, long nenner) {
		this.zaehler = zaehler;
		this.nenner = nenner;
	}
	
	Bruch(long ganzZahl) {
		this.ganzZahl = ganzZahl;
		Bruch testGanzzahl = new Bruch(ganzZahl, nennerWennGanzzahl);
	}
	
	private static long ggt(long zaehler, long nenner) {
		if (nenner==0)
			return zaehler;
		return ggt(nenner, zaehler%nenner);
	}
	
	public void add(Bruch x) {
		long ergebnis = this.zaehler / this.nenner + ganzZahl;
		System.out.println(ergebnis);
	}
	
	public static Bruch add2(Bruch a, Bruch b) {
		long z = a.zaehler * b.nenner + a.nenner * b.zaehler;
		long n = a.nenner * b.nenner;
		
		Bruch addErgebnis = new Bruch(z, n);
		
		addErgebnis.zaehler = z;
		addErgebnis.nenner = n;
		
		return addErgebnis;
	}
	
	public static Bruch mul2(Bruch a, Bruch b) {
		long z = a.zaehler * b.zaehler;
		long n = a.nenner * b.nenner;
		
		Bruch mul2Ergebnis = new Bruch(z, n);
		
		mul2Ergebnis.zaehler = z;
		mul2Ergebnis.nenner = n;
		
		return mul2Ergebnis;
	}
	
	public String toString() {
		long kuerzen = ggt(zaehler, nenner);
		if(kuerzen != 0) {
			long gekuerzterZaehler = zaehler/kuerzen;
			long gekuerzterNenner = nenner/kuerzen;
			return gekuerzterZaehler + "/" + gekuerzterNenner;
		} else 
			return zaehler + "/" + nenner;
		
	}
	
	public static void main(String[] args) {
		Bruch erster = new Bruch(3, 4);
		Bruch zweiter = new Bruch(3, 4);
		
		//add(erster);
		
		Bruch test2 = add2(erster, zweiter);
		System.out.println(test2.toString());
		
		Bruch test3 = mul2(erster, zweiter);
		System.out.println(test3.toString());
		
	}

}