import static pr.MakeItSimple.print;
import static pr.MakeItSimple.println;
import static pr.MakeItSimple.readString;

public class UI {

	// main
	
	public static Comparable[] sortArray(Comparable[] array, SortInterface st) {
        print("(Umgekehrt (u) / Normal (n))");
        String s = readString();
            st.sort(array, s);
            return array;
    }
	
	public static void main(String[] args) {

		println("Mit welchem Verfahren m�chten sie sortieren InsertionSort oder QuickSort?");
		String verfahren = readString();
		
		println("int/string?"); 
		println("end to stop");

		String input = readString();

		if (input.equalsIgnoreCase("int")) {	//Comparable Ints

			Comparable[] array = new Comparable[5];
			
			for (int i = 0; i < i + 1; i++) {
				String inputString = readString();

				if (!inputString.contains("0") || !inputString.contains("1") || !inputString.contains("2")
						|| !inputString.contains("3") || !inputString.contains("4") || !inputString.contains("5")
						|| !inputString.contains("6") || !inputString.contains("7") || !inputString.contains("8")
						|| !inputString.contains("9")) {

					if (inputString.equalsIgnoreCase("end")) {

//						for (int j = 0; j < i; j++) {
//							print(array[j] + " ");
//						}
						
						println("");
						println("Done!");
						
						if(verfahren.equalsIgnoreCase("quicksort")) {
							
							QuickSortV3 qs = new QuickSortV3();
							
							qs.sort(array, "u");
						} else if(verfahren.equalsIgnoreCase("insertionsort")) {
							
							InsertionSort is = new InsertionSort();
							is.sort(array, "u");
						}

						return;
					}

					array[i] = inputString;	//save the int in array

				} else {	//int doesen't exist
					print("Du musst ein int eingeben");
					return;
				}
			}

		} else if (input.equalsIgnoreCase("string")) {		//Comparable Strings

			Comparable[] array = new Comparable[5];

			for (int i = 0; i < i + 1; i++) {
				String inputString = readString();

				if (inputString.contains("0") || inputString.contains("1") || inputString.contains("2")
						|| inputString.contains("3") || inputString.contains("4") || inputString.contains("5")
						|| inputString.contains("6") || inputString.contains("7") || inputString.contains("8")
						|| inputString.contains("9")) {

					println("Du musst ein string eingeben!");
					return;
				}

				if (inputString.equalsIgnoreCase("end")) {

//					for (int j = 0; j < i; j++) {
//						print(array[j] + " ");
//					}

					println("");
					println("Done!");
					
					if(verfahren.equalsIgnoreCase("quicksort")) {
						
						QuickSortV3 qs = new QuickSortV3();
						
						qs.sort(array, "u");
					} else if(verfahren.equalsIgnoreCase("insertionsort")) {
						
						InsertionSort is = new InsertionSort();
						is.sort(array, "u");
					}
					
					return;
				}
				array[i] = inputString;	//save the Strings in array
			}

		} else {
			println("Fehler!");
		}
	}
}