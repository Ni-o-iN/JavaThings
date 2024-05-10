public class Box<E> {

	//Kommentar
	
	E val;

	public Box() {

	}

	public void setValue(E val) {
		this.val = val;
	}

	public E getValue() {
		return val;
	}
	
	public String toString(E val) {
		return val + "";
	}

}