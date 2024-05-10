public class InsertionSort {

	public void sort (Comparable[] array, String s) {
			
			for (int i = 1; i < array.length; i++) {
				Comparable mid = array[i];
				int j = i;
				while (j > 0) {
					if(s.equals("u")) {
						if(mid.compareTo(array[j-1]) > 0) {
							array[j] = array[j-1];
							j--;
						} else {
							break;
						}
					} else {
						if(mid.compareTo(array[j-1]) < 0) {
							array[j] = array[j-1];
							j--;
						} else {
							break;
					}
				}
				if (j != i) {
					array[j] = mid;
				}
			}
		}
	}
}