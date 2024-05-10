import pr2.uebung01.SortInterface;
import pr2.uebung01.StatObjectSort;

public class QuickSortV2 implements SortInterface {
	
	@Override
	public void sort(int[] f3, StatObjectSort so) {
		
		if(f3 == null) {
			System.out.println("Array ist 0!");
		}
		
		System.out.print("Ungeordnet: ");
		for(int j = 0; j < f3.length; j++) {
			System.out.print(f3[j] + " ");	
		}
		
		System.out.println();
		
		int untereGrenze = 0;
		int obereGrenze = f3.length - 1;
		
		//invoke methods
		quicksort(f3, untereGrenze, obereGrenze, so);
		teilen(f3, untereGrenze, obereGrenze, so);

		System.out.print("Geordnet: ");
		for(int j = 0; j < f3.length; j++) {
			System.out.print(f3[j] + " ");	
		}
	}

	public void quicksort(int[] f3, int untereGrenze, int obereGrenze, StatObjectSort so) {
		if (untereGrenze < obereGrenze) {
			//pivot is partitioning index
			int partitionIndex = teilen(f3, untereGrenze, obereGrenze, so);
			//sort elements before and after partition
			quicksort(f3, untereGrenze, partitionIndex - 1, so);
			quicksort(f3, partitionIndex + 1, obereGrenze, so);
		}
	}

	public int teilen(int[] f3, int untereGrenze, int obereGrenze, StatObjectSort so) {
		
		int pivot = f3[obereGrenze];
		int i = (untereGrenze - 1);

		for (int j = untereGrenze; j < obereGrenze; j++) {
			if (f3[j] <= pivot) {
				i++;
				so.inccomparisonCounter();
				//swapping numbers
				int swapTemp = f3[i];
				f3[i] = f3[j];
				f3[j] = swapTemp;
			}
		}
		int swapTemp = f3[i + 1];
		so.inccomparisonCounter();
		f3[i + 1] = f3[obereGrenze];
		f3[obereGrenze] = swapTemp;

		return i + 1;
	}
}
