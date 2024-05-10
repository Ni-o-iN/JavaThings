import pr2.uebung01.SortInterface;
import pr2.uebung01.StatObjectSort;

public class QuickSortV3 implements SortInterface {
	
    @Override
    public void sort(int[] f3, StatObjectSort so) {
    	System.out.print("Ungeordnet: ");
		for(int j = 0; j < f3.length; j++) {
			System.out.print(f3[j] + " ");	
		}
		
		System.out.println();
    	
        int untereGrenze = 0;
        int obereGrenze = f3.length - 1;
        
        //invoke method
        quicksort(f3, untereGrenze, obereGrenze, so);
        
        System.out.print("Geordnet: ");
		for(int j = 0; j < f3.length; j++) {
			System.out.print(f3[j] + " ");	
		}
    }

    public void quicksort(int[] array, int untereGrenze, int obereGrenze, StatObjectSort so) {
        if (untereGrenze < obereGrenze) {
        	//pivot is partitioning index
            int partitionIndex = teilen(array, untereGrenze, obereGrenze, so);
            //sort elements before and after partition
            quicksort(array, untereGrenze, partitionIndex - 1, so);
            quicksort(array, partitionIndex + 1, obereGrenze, so);
        }
    }

    public int teilen(int[] f3, int untereGrenze, int obereGrenze, StatObjectSort so) {
        int pivot = f3[obereGrenze];
        int i = untereGrenze - 1;

        so.inccomparisonCounter();
        for (int j = untereGrenze; j < obereGrenze; j++) {
            so.inccomparisonCounter();
            if (f3[j] < pivot) {
                i++;
                //swapping numbers
                so.incAndGetswapCounter();
                int swapTemp = f3[i];
                f3[i] = f3[j];
                f3[j] = swapTemp;
                if (f3[j] < f3[j + 1]) {
                    so.incswapCounter();
                    swapTemp = f3[i + 1];
                    f3[i + 1] = f3[j + 1];
                    f3[j + 1] = swapTemp;
                }
            }
        }
        so.incswapCounter();
        int swapTemp = f3[i + 1];
        f3[i + 1] = f3[obereGrenze];
        f3[obereGrenze] = swapTemp;
        
        return i + 1;
    }
}