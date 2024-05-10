import static pr.MakeItSimple.*;
import org.hamcrest.core.IsEqual;
import pr2.uebung02.StringElement;

//Template for Hashtable
public class HashTable {

	public int currentSize, maxSize;
	private Probing p;
	private String[] keys;
	private String[] vals;
	private int numberOfCollisions = 0; // statistics counter for collisions

	public int getStat() {
		return numberOfCollisions;
	}

	public HashTable(Probing p) { // hash table with default size = 10, default probing = linear
		new HashTable(10, p);
	}

	public HashTable(int size, Probing p) { // hash table with default size = 10, default probing = linear
		currentSize = 0;
		maxSize = size;
		keys = new String[maxSize];
		vals = new String[maxSize];
		this.p = p;
	}

	public void clear() { // clear hash table
		currentSize = 0;
		keys = new String[maxSize];
		vals = new String[maxSize];
	}

	public boolean isEmpty() {
		return size() == 0;		//true if table is empty, false if not
	}

	public void printHT() {
		System.out.println("\nHash Table: ");
		for (int i = 0; i < maxSize; i++)
			if (keys[i] != null)
				System.out.println(keys[i] + " " + vals[i]);
		System.out.println();
	}

	public int size() {
		return currentSize;		//number of stored elements in the hash table
	}

	public void reHash() { 	//only for reason of test to enforce rehashing rehash all keys
					//rehash all keys
		
		if(currentSize/maxSize >= 0.75) {
		
			currentSize = currentSize*2;
			
			int i = hash(keys[0]);
			int j = 1;
			
			if (p instanceof LinearProbing) {
				for (i = (i + 1) % maxSize; keys[i] != null; i = (i + 1) % maxSize) {
					String tmp1 = keys[i];
					String tmp2 = vals[i];
					keys[i] = null;
					vals[i] = null;
					currentSize--;
					put(tmp1, tmp2);
				}
			} else {	//QuadraticProbing
				for (i = (i + j * j++) % maxSize; keys[i] != null; i = (i + j * j++) % maxSize) {
					String tmp1 = keys[i];
					String tmp2 = vals[i];
					keys[i] = null;
					vals[i] = null;
					currentSize--;
					put(tmp1, tmp2);
				}
			}
		}
	}

	public Object put(Object key, Object value) {
		int tmp = hash(key);
		int i = tmp;
		int j = 1;
		// Do part for performing actions
		do {
			if (keys[i] == null) {
				keys[i] = ((StringElement) key).getKey() + "";
				vals[i] = value + "";
				currentSize++;
				return null;	//key was not in the table
			}
			if (keys[i].equals(((StringElement) key).getKey())) {
				String temp = vals[i];
				vals[i] = value + "";
				return temp;	//key was already in the table
			} if (p instanceof LinearProbing) {
				i = (i + 1) % maxSize;
			} else {	//QuadraticProbing
				i = (i + j * j++) % maxSize;
			}
		}
		// while part for condition check
		while (i != tmp);
		return null;
	}

	public boolean remove(Object key) {
		if (!containsKey(key))
			return false;	//key does not exist

		// Find position key and delete
		int i = hash(key);
		int h = 1;
		while (!((StringElement) key).getKey().equals(keys[i])) {
			if (p instanceof LinearProbing) {
				i = (i + 1) % maxSize;
			} else {	//QuadraticProbing
				i = (i + h * h++) % maxSize;
			}
		}
		keys[i] = null;
		vals[i] = null;
		currentSize--;
		return true;	//key got deleted
	}

	public Object get(Object key) {
		int i = hash(key);
		int h = 1;
		while (keys[i] != null) {
			if (keys[i].equals(((StringElement) key).getKey()))
				return vals[i];
			if (p instanceof LinearProbing)
				i = (i + 1) % maxSize;
			else	//QuadraticProbing
				i = (i + h * h++) % maxSize;
		}
		return null;	//key not found
	}

	public boolean containsKey(Object key) {
		return get(key) != null;	//true if key exist, false if not
	}

	public boolean contains(Object value) {
		for (int i = 0; i < maxSize; i++) {
			if (keys[i] != null) {
				Object val = get(new StringElement(vals[i]));
				if (keys[i] != null && ((String) val).equals((String) value))
					return true;	//value found
			}
		}
		return false;	//value not found
	}

	private int hash(Object key) {
		return key.hashCode() % maxSize;
	}
}