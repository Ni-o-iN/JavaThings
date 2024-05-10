public class ShakerSort implements SortInterface {

	@Override
	public void sort(int[] f3, StatObjectSort so) {
		boolean swapped = true;
		
		while(swapped) {
			swapped = false;
			if(so.getrunCounter() % 2 == 0) {	//Array wird von links nach rechts sortiert
				for(int i = so.getrunCounter() / 2; i < f3.length - ( 1 + so.getrunCounter()/2); i++) {
					so.inccomparisonCounter();		//Vergleich Counter wird hier hochgesetzt
					if(f3[i] > f3[i + 1]) {
						so.incswapCounter();		//Tausch Counter wird hier hochgesetzt
						int cache = f3[i];
						f3[i] = f3[i + 1];		//Element i wird eins nach rechts auf i + 1 getauscht
						f3[i + 1] = cache;		//Element  i + 1 wird eins nach links auf i getauscht
						swapped = true;		//Elemente wurden getauscht
					}
				}
			} else		//Array wird von rechts nach links sortiert
				for(int i = f3.length - (2 + so.getrunCounter() / 2); i > so.getrunCounter() / 2; i--) {
					so.inccomparisonCounter();		//Vergleich Counter wird hier hochgesetzt
					if(f3[i] < f3[i - 1]) {
						so.incswapCounter();		//Tausch Counter wird hier hochgesetzt
						int cache = f3[i];
						f3[i] = f3[i - 1];		//Element i wird eins nach links auf i - 1 getauscht
						f3[i - 1] = cache;		//Element i - 1 wird eins nach rechts auf i getauscht
						swapped = true;		//Elemente wurden getauscht
					}
				}
			so.incrunCounter();		//Durchlauf Counter wird hier hochgesetzt
		}
	}
}
