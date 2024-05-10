public class IntElement implements Element, Cloneable {
	
	public int val;

	public IntElement(int val) {
		this.val = val;
	}

	public Object clone() {
		return null;
	}

	public int compareTo(Object arg0) {

		if (arg0 instanceof IntElement) {
		if (val > (int) ((IntElement) arg0).getKey())
			return 1;
		else if (val < (int) ((IntElement) arg0).getKey())
			return -1;
		else
			return 0;
	}
		return 0;
	}
	public Object getKey() {
		return val;
	}

	@Override
	public String toString() {
		return val + "";
	}

}