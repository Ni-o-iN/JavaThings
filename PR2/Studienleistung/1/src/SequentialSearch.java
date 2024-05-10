public class SequentialSearch implements SearchInterface {

	public int search(int[] A, int key, StatObjectBase so) {
		int i = 0;
		
		while(i < A.length) {
			so.inccomparisonCounter();	//Vergleich Counter wird hier hochgesetzt
			if(A[i] == key)
				return i;	//key gefunden und Index wird ausgegeben
			i++;
		}
		return -1;	//key wurde nicht gefunden
	}
}