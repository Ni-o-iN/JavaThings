import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class InsertionSortBS1stTest {
	
	int[] F1;
	int[] F2;
	int[] F3;
	
	StatObjectSort so;

	@Before
	public void prepareTest() {
		F1 = new int[] { 10, 4, 33, 44, 17, 20, 3, 2, 9, 82, 38, 67, 55, 11, 32, 23, 19, 7, 6, 14, 29 };  // zuf�lliges Feld
		F2 = new int[] { 10, 4, 33, 44, 17, 20, 3, 2, 9, 82, 38, 67, 55, 11, 32, 23, 19, 7, 6, 14, 29, 10, 10 }; // zuf�lliges Feld mit Duplikaten
		F3 = new int [] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};  // F ist schon sortiert;

		so = new StatObjectSort();
	}
	
	@Test
	public void testInsertionBS() {  // Insertion Sort mit bin�rer Suche nach Einf�geposition
		SortInterface sm = new InsertionSortBS();
		sm.sort(F1, so);
		assertThat(F1, is(new int[] { 2, 3, 4, 6, 7, 9, 10, 11, 14, 17, 19, 20, 23, 29, 32, 33, 38, 44, 55, 67, 82 }));
		assertEquals(64, so.getcomparisonCounter());
		assertEquals (122, so.getswapCounter());
		assertEquals (20, so.getrunCounter());		
		
		so = new StatObjectSort();
		sm.sort(F2, so);
		assertThat(F2,
				is(new int[] { 2, 3, 4, 6, 7, 9, 10, 10, 10, 11, 14, 17, 19, 20, 23, 29, 32, 33, 38, 44, 55, 67, 82 }));
		assertEquals(73, so.getcomparisonCounter());
		assertEquals (152, so.getswapCounter());
		assertEquals (22, so.getrunCounter());
		
		so = new StatObjectSort();
		sm.sort(F3, so);
		assertThat(F3, is(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }));
		assertEquals(19, so.getcomparisonCounter());
		assertEquals (0, so.getswapCounter());
		assertEquals (9, so.getrunCounter());
		assertEquals (19, so.getcomparisonCounter());
	}


}
