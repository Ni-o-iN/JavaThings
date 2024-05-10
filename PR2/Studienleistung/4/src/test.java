import pr2.uebung02.*;

public class test {

	public static void main(String[] args) {
		
		Comparable[] array = new Comparable[3];
		
		IntElement ie = new IntElement(3);
		IntElement ie2 = new IntElement(10);
		IntElement ie3 = new IntElement(1);
		
		array[0] = ie;
		array[1] = ie2;
		array[2] = ie3;
		
		QuickSortV3 qs = new QuickSortV3();
		
//		for(int i = 0; i < array.length; i++) {
//			System.out.print(array[i] + " ");
//		}
		
		qs.sort(array, "u");
	
		System.out.println("");
//		for(int i = 0; i < array.length; i++) {
//			System.out.print(array[i] + " ");
//		}
		
	}
	
}
