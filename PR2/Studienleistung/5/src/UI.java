import static pr.MakeItSimple.readInt;
import static pr.MakeItSimple.readString;

public class UI {

	Tree bt;

	public UI(Tree bt) { // is callable for every kind of tree
		this.bt = bt;
	}

	public void menu() {

		while (true) {
			System.out.println(
					"Aktion ([I]nsert|[P]reorder|[L]evelorder|[X]Postorder|[Y]Inorder|[V]isualize|[S]top|[C]lone|[R]emove|[E]quals|"
							+ "[A]ddAll|[Z]Contains|[F]SavetoFile|[N]IsEmpty)");

			String input = readString();
			char action = input.charAt(0);

			switch (action) {
			case 'i':
				System.out.println("Wert eingeben: ");
				IntElement element = new IntElement(readInt());
				bt.insert(element);
				break;
			case 'p':
				bt.printPreorder();
				break;
			case 'l':
				bt.printLevelorder();
				break;
			case 'x':
				bt.printPostorder();
				break;
			case 'y':
				bt.printInorder();
				break;
			case 'v':
				bt.visualize();
				break;
			case 's':
				return;
			case 'c':
				bt.clone();
				break;
			case 'r':
				bt.remove(null);
				break;
			case 'e':
				bt.equals(null);
				break;
			case 'a':
				bt.addAll(bt);
				break;
			case 'z':
				bt.contains(null);
				break;
			case 'f':
				bt.saveToFile(input);
				break;
			case 'n':
				bt.isEmpty();
				break;
			default:
			}
		}
	}
}