public class BinarySearch implements SearchInterface {

    @Override
    public int search(int[] A, int key, StatObjectBase so) {

        int left = 0, right = A.length - 1;	//die Grenzen definiert

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
        return -1;			//key wurde nicht gefunden
    }
}