public class QuadraticProbing implements Probing {

	int zahl;
	int counter;
	int maxSize;
	
	public QuadraticProbing() {
		zahl = 1;
	}
	
	@Override
	public int nextNum() {
		counter++;
		int i = 1;
		int j = 0;
		int k = -1;
		if(i > 0) {
			i = (k * j * j++) % maxSize;
		} else {
			i = (j * j++) % maxSize;
		}
		return i;
	}

	@Override
	public void startProbing() {
		counter = 0;
		
	}
}