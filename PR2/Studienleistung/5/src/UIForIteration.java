import static pr.MakeItSimple.readInt;
import static pr.MakeItSimple.readString;

public class UIForIteration {

	static Tree bt;

	public UIForIteration(Tree bt) { // is callable for every kind of tree
		this.bt = bt;
	}

	public static void main(String[] args) {

		while (true) {
			System.out.println("Aktion ([x] Insert), ([i] Iteration)");

			String input = readString();
			char action = input.charAt(0);

			switch (action) {
			case 'x':
				System.out.println("Wert eingeben: ");
				IntElement element = new IntElement(readInt());

				System.out.println(element);
				bt.insert(element);
				break;
			case 'i':
				bt.iterator();
				break;
			default:
				
				
				
			}
		}
	}
}