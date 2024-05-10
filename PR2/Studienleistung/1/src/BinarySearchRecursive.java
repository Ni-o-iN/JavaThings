public class BinarySearchRecursive implements SearchInterface {
	
	@Override
	public int search(int[] A, int key, StatObjectBase so) {
		return binarySearchRecursive(A, 0, A.length - 1, key, so);
	}
	
	public int binarySearchRecursive(int[] A, int left, int right, int key, StatObjectBase so) {
		
		so.inccomparisonCounter();		//Vergleich Counter wird hier hochgesetzt
		
		if(right >= left) {
			int mid = (left + right) / 2;
			
			if(A[mid] == key) {
				so.inccomparisonCounter();		//Vergleich Counter wird hier hochgesetzt
				return mid;						//key gefunden und Index wird ausgegeben
			} else if(A[mid] > key) {
				so.inccomparisonCounter();									//Vergleich Counter wird hier hochgesetzt
				return binarySearchRecursive(A, left, mid - 1, key, so);	//neue linke Grenze, jetzt suchen wir in der rechten h�lfte
			} else {
				so.inccomparisonCounter();									//Vergleich Counter wird hier hochgesetzt
				return binarySearchRecursive(A, mid + 1, right, key, so);	//neue rechte Grenze, jetzt suchen wir in der linke h�lfte
			}
		}
		return -1;		//key wurde nicht gefunden
	}
}