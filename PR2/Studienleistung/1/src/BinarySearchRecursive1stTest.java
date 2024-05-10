import org.junit.Test;
import static org.junit.Assert.*;

public class BinarySearchRecursive1stTest {

	int[] F1 = { 6, 12, 18, 42, 44, 55, 55, 67, 94 };
	

	@Test
	public void searchMiddle() {
		assertEquals(6, new BinarySearchRecursive().search(F1, 55, new StatObjectBase()));
	}

	@Test
	public void searchFirst() {
		assertEquals(0, new BinarySearchRecursive().search(F1, 6, new StatObjectBase()));
	}

	@Test
	public void searchLast() {
		assertEquals(8, new BinarySearchRecursive().search(F1, 94, new StatObjectBase()));
	}
}
