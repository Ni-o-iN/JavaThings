import pr2.uebung01.StatObjectSort;
import pr2.uebung01.SortInterface;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class QuickSortV2Test {

	int[] F1;
	int[] F2;
	int[] F3;


	StatObjectSort so;

	@Before
	public void prepareTest() {
		F1 = new int[] { 10, 4, 33, 44, 17, 20, 3, 2, 9, 82, 38, 67, 55, 11, 32, 23, 19, 7, 6, 14, 29 }; // zuf�lliges
																											// Feld
		F2 = new int[] { 10, 4, 33, 44, 17, 20, 3, 2, 9, 82, 38, 67, 55, 11, 32, 23, 19, 7, 6, 14, 29, 10, 10 }; // zuf�lliges
																													// Feld
																													// mit
																													// Duplikaten
		F3 = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; // F ist schon sortiert;
	}
	@Test
	public void testQuick21() {   // QuickSort Variante 2
		SortInterface sm = new QuickSortV2();
		
		so = new StatObjectSort();
		sm.sort(F1, so);
		assertThat(F1, is(new int[] { 2, 3, 4, 6, 7, 9, 10, 11, 14, 17, 19, 20, 23, 29, 32, 33, 38, 44, 55, 67, 82 }));
		assertEquals (89, so.getcomparisonCounter());
		assertEquals(21, so.getswapCounter());
		assertEquals(14, so.getrunCounter());
		
		so = new StatObjectSort();
		sm.sort(F2, so);
		assertThat(F2, is(new int[] { 2, 3, 4, 6, 7, 9, 10, 10, 10, 11, 14, 17, 19, 20, 23, 29, 32, 33, 38, 44, 55, 67, 82 }));
		assertEquals (119, so.getcomparisonCounter());
		assertEquals(24, so.getswapCounter());
		assertEquals(18, so.getrunCounter());
		
		so = new StatObjectSort();
		sm.sort(F3, so);
		assertThat(F3, is(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }));
		assertEquals (54, so.getcomparisonCounter());
		assertEquals(0, so.getswapCounter());
		assertEquals(9, so.getrunCounter());
	}

}