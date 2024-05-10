public class StringElement implements Element {

	public String val;

	public StringElement(String val) {
		this.val = val;
	}

	public Object clone() {
		return null;
	}

	@SuppressWarnings("unlikely-arg-type")
	public int compareTo(Object arg0) {
		return val.compareTo(((StringElement) arg0).val);
	}

	public Object getKey() {

		return val;
	}

	public String toString() {
		return val + "";
	}

}