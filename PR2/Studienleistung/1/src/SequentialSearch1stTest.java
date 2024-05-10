import org.junit.Test;
import static org.junit.Assert.*;

public class SequentialSearch1stTest {

	int[] F1 = { 6, 12, 18, 42, 44, 55, 55, 67, 94 };

	@Test
	public void searchMiddle() {
		assertEquals(5, new SequentialSearch().search(F1, 55, new StatObjectBase()));
	}

	@Test
	public void searchFirst() {
		assertEquals(0, new SequentialSearch().search(F1, 6, new StatObjectBase()));
	}

	@Test
	public void searchLast() {
		assertEquals(8, new SequentialSearch().search(F1, 94, new StatObjectBase()));
	}
}