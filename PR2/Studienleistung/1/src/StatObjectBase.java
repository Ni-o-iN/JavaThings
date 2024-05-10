public class StatObjectBase {
	
	public int comparisonCounter;  
	
	public int incAndGetcomparisonCounter () {
		return ++comparisonCounter;
	}
	
	public int getcomparisonCounter () {
		return comparisonCounter;
	}
	
	public void inccomparisonCounter () {
		comparisonCounter++;
	}
	
	@Override
	public String toString() { 
		return   "# Vergleiche: " + getcomparisonCounter();
	}

}
