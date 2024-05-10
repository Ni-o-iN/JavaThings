public class LinearProbing implements Probing {

	private int zahl1;
	private int zahl2;
	private int maxSize;
	private int counter;
	private int i;
	
	public LinearProbing(int zahl1, int zahl2, int maxSize, int i) {
		this.zahl1 = zahl1;
		this.zahl2 = zahl2;
		this.maxSize = maxSize;
		this.i = i;
	}
	
	public LinearProbing() {
		zahl1 = 1;
		zahl2 = 2;
	}
	
	@Override
	public int nextNum() {
		counter++;
		int i = 1;
		if(zahl2 == 1) { //nicht alternierend
			i = (i + zahl1) % maxSize;
		} else if(zahl2 == 2) { //alternierend
			if(i > 0) {
				i = (i - zahl1) % maxSize;
			} else {
				i = (i + zahl1) % maxSize;
			}
			zahl1++;
		}
		return i;
	}

	@Override
	public void startProbing() {
		counter = 0;
	}

}