public class StatObjectSort extends StatObjectBase {
	
	private int swapCounter;  // swap counter       = Zahler f�r Vertauschungen                    # nur f�r Sortierverfahren
	private int runCounter;  // run counter        = Zahler f�r Durchl�ufe / Rekursionsschritte   # nur f�r Sortierverfahren
	
	public int incAndGetswapCounter () {return ++swapCounter;}
	public int incAndGetrunCounter () {return ++runCounter;}
	
	
	public int getswapCounter () {return swapCounter;}
	public int getrunCounter () {return runCounter;}
	
	public void incswapCounter () {swapCounter++;}
	public void incrunCounter () {runCounter++;}
	
	@Override
	public String toString() { // dient der Ausgabe von Statistik-Daten in print-Anweisungen
		return  super.toString()  + " # Vertauschungen: " + getswapCounter() + " # Durchl�ufe: " + getrunCounter();
	}


}