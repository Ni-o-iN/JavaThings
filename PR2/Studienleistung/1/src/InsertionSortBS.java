public class InsertionSortBS implements SortInterface {

	public void sort(int A[], StatObjectSort so) {
		
        int length = A.length;

        for (int i = 1; i < length; i++) {
            so.incrunCounter();		//Durchlauf Counter wird hier hochgesetzt
            int key = A[i];
            int inserted = search(A, 0, i - 1, key, so);
            for (int j = i - 1; j >= inserted; j--) {
                so.incswapCounter();		//Tausch Counter wird hier hochgesetzt
                A[j + 1] = A[j];
            }
            so.incswapCounter();		//Tausch Counter wird hier hochgesetzt
            A[inserted] = key;
        }
    }
	
	public int search(int[] A, int key, int left, int right, StatObjectBase so) {

        while (left <= right) {
            int mid = (left + right) / 2;
            so.inccomparisonCounter();		//Vergleich Counter wird hier in der while-Schleife hochgesetzt
            if (A[mid] == key) {
                return mid;
            } else if (key < A[mid]) {
                right = mid - 1;		//rechte Grenze neu definiert, jetzt wird in der linken h�lfte gesucht
            } else {
                left = mid + 1;			//linke Grenze neu definiert, jetzt wird in der rechten h�lfte gesucht
            }
        }
        return left;			//key wurde nicht gefunden
    }
}