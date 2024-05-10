public class InsertionSort implements SortInterface{
		
	public void sort (int A[], StatObjectSort so) {
		
		for (int i = 1; i < A.length; i++) {	//A[6,8,5]    2.durchlauf
			int mid = A[i];
			int j = i;
			so.incrunCounter();		//Durchlauf Counter wird hier hochgesetzt
			while (j > 0) {
				so.inccomparisonCounter();		//Vergleich Counter wird hier hochgesetzt
                if (A[j - 1] > mid) {
                    so.incswapCounter();		//Tausch Counter wird hier hochgesetzt
                    A[j] = A[j - 1];
                    j--;
                } else		//Schleife verlassen, weil Einf�geposition gefunden wurde 
                	break;
                }
			if (j != i) {
				A[j] = mid;
				so.incswapCounter();		//Tausch Counter wird hier hochgesetzt
			}
		}
	}
}