import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

import pr2.uebung01.SortInterface;
import pr2.uebung01.StatObjectSort;

public class QuickSortV11stTest {

	int[] F1;
	int[] F2;
	int[] F3;

	StatObjectSort so;

	@Before
	public void prepareTest() {
		F1 = new int[] { 10, 4, 33, 44, 17, 20, 3, 2, 9, 82, 38, 67, 55, 11, 32, 23, 19, 7, 6, 14, 29 }; // zufälliges
																											// Feld
		F2 = new int[] { 10, 4, 33, 44, 17, 20, 3, 2, 9, 82, 38, 67, 55, 11, 32, 23, 19, 7, 6, 14, 29, 10, 10 }; // zufälliges
																													// Feld
																													// mit
																													// Duplikaten
		F3 = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; // F ist schon sortiert;

	}

	@Test
	public void testQuick11() { // QuickSort Variante 1
		SortInterface sm = new QuickSortV1();

		//so = new StatObjectSort();
		//sm.sort(F1, so);
		//assertThat(F1, is(new int[] { 2, 3, 4, 6, 7, 9, 10, 11, 14, 17, 19, 20, 23, 29, 32, 33, 38, 44, 55, 67, 82 }));
		//assertEquals(122, so.getcomparisonCounter());

//		so = new StatObjectSort();
//		sm.sort(F2, so);
//		assertThat(F2,
//				is(new int[] { 2, 3, 4, 6, 7, 9, 10, 10, 10, 11, 14, 17, 19, 20, 23, 29, 32, 33, 38, 44, 55, 67, 82 }));
//		assertEquals(142, so.getcomparisonCounter());

		so = new StatObjectSort();
		sm.sort(F3, so);
		assertThat(F3, is(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }));
		assertEquals(43, so.getcomparisonCounter());

	}

}