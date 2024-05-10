public class QuickSortV3 {

	public void sort(Comparable[] array, String s) {
		
    	System.out.print("Ungeordnet: ");
		for(int j = 0; j < array.length; j++) {
//			if(array[j] == null) {
//				return;
//			}
			System.out.print(array[j] + " ");	
		}
		
		System.out.println();
    	
        int untereGrenze = 0;
        int obereGrenze = array.length - 1;
        
        //invoke method
        quicksort(array, untereGrenze, obereGrenze, s);
        
        System.out.print("Geordnet: ");
		for(int j = 0; j < array.length; j++) {
			System.out.print(array[j] + " ");	
		}
    }

    public void quicksort(Comparable[] array, int untereGrenze, int obereGrenze, String s) {
        if (untereGrenze < obereGrenze) {
        	//pivot is partitioning index
            int partitionIndex = teilen(array, untereGrenze, obereGrenze, s);
            //sort elements before and after partition
            quicksort(array, untereGrenze, partitionIndex - 1, s);
            quicksort(array, partitionIndex + 1, obereGrenze, s);
        }
    }

    public int teilen(Comparable[] array, int untereGrenze, int obereGrenze, String s) {
    	Comparable pivot = array[obereGrenze];
        int i = untereGrenze - 1;
        
        if(s.equals("n")) {
        	for (int j = untereGrenze; j < obereGrenze; j++) {
                if (array[j].compareTo(pivot) == -1) {
                    i++;
                    //swapping numbers
                    Comparable swapTemp = array[i];
                    array[i] = array[j];
                    array[j] = swapTemp;
                    if (array[j].compareTo(array[j + 1]) == -1) {
                        swapTemp = array[i + 1];
                        array[i + 1] = array[j + 1];
                        array[j + 1] = swapTemp;
                    }
                }
            }
            Comparable swapTemp = array[i + 1];
            array[i + 1] = array[obereGrenze];
            array[obereGrenze] = swapTemp;
            
        } else {
        	for (int j = untereGrenze; j < obereGrenze; j++) {
                if (array[j].compareTo(pivot) == 1) {
                    i++;
                    //swapping numbers
                    Comparable swapTemp = array[i];
                    array[i] = array[j];
                    array[j] = swapTemp;
                    if (array[j].compareTo(array[j + 1]) == 1) {
                        swapTemp = array[i + 1];
                        array[i + 1] = array[j + 1];
                        array[j + 1] = swapTemp;
                    }
                }
            }
            Comparable swapTemp = array[i + 1];
            array[i + 1] = array[obereGrenze];
            array[obereGrenze] = swapTemp;
        }
        return i + 1;
    }
}