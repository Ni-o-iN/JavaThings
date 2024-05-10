import static pr.MakeItSimple.*;

public class UIForIteration {

    Tree bt;

    public UIForIteration(Tree bt) { // is callable for every kind of tree
        this.bt = bt;
    }

    public void menu() {

        while(true) {
            System.out.println("Aktion ([x] Insert), ([i] Iteration)");


            String input = readString();
            char action = input.charAt(0);

            switch(action) {
            case 'x':
                System.out.println("Wert eingeben: ");
                IntElement element = new IntElement(readInt());
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