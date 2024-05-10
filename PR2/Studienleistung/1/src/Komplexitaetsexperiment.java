public class Komplexitaetsexperiment {
	
	public static void main(String[] args) {
		
		int[] first = new int[1024];
		int[] second = new int[2048];
		int[] third = new int[4098];
		
		first = arraysErstellen(first);
		second = arraysErstellen(second);
		third = arraysErstellen(third);
		
		sortInsertion(first);
		sortInsertion(second);
		sortInsertion(third);
		
		
	}
	
	
	public int searchBinary(int[] A, int key) {

        int left = 0, right = A.length - 1;	//die Grenzen definiert

        while (left <= right) {
            int mid = (left + right) / 2;
            if (A[mid] == key) {
                return mid;
            } else if (key < A[mid]) {
                right = mid - 1;		//rechte Grenze neu definiert, jetzt wird in der linken h�lfte gesucht
            } else {
                left = mid + 1;			//linke Grenze neu definiert, jetzt wird in der rechten h�lfte gesucht
            }
        }
        return -1;			//key nicht gefunden
    }
	
	
	
	public int searchBinaryRecursive(int[] A, int key) {
		return binarySearchRecursive(A, 0, A.length - 1, key);
	}
	
	
	
	public int binarySearchRecursive(int[] A, int left, int right, int key) {
				
		if(right >= left) {
			int mid = (left + right) / 2;
			
			if(A[mid] == key) {
				return mid;						//key gefunden und Index wird ausgegeben
			} else if(A[mid] > key) {
				return binarySearchRecursive(A, left, mid - 1, key);	//neue linke Grenze, jetzt suchen wir in der rechten h�lfte
			} else {
				return binarySearchRecursive(A, mid + 1, right, key);	//neue rechte Grenze, jetzt suchen wir in der linke h�lfte
			}
		}
		return -1;		//key nicht gefunden
	}
	
	
	
	public int searchSequential(int[] A, int key) {
		int i = 0;
		
		while(i < A.length) {
			if(A[i] == key)
				return i;	//key gefunden und Index wird ausgegeben
			i++;
		}
		return -1;	//key nicht gefunden
	}
	
	
	public static void sortInsertion(int A[]) {
			
			for (int i = 1; i < A.length; i++) {
				int mid = A[i];
				int j = i;
				while (j > 0) {
	                if (A[j - 1] > mid) {
	                    A[j] = A[j - 1];
	                    j--;
	                } else		//Schleife verlassen, weil Einf�geposition gefunden wurde 
	                	break;
	                }
				if (j != i) {
					A[j] = mid;
				}
			}
		}



	public static int[] arraysErstellen(int[] A) {
		
		for(int i = 0; i < A.length-1; i++) {
			A[i] = (int) Math.floor(Math.random()*100);
		}
		return A;
	}

}