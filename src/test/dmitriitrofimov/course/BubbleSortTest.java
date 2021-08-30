package dmitriitrofimov.course;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class BubbleSortTest {

	@Test
	public void testBubbleSort() {
		int[] array = {4, 12, -17, 3};
		int[] expected = {-17, 3, 4, 12};
		BubbleSort.bubbleSort(array);
		assertArrayEquals(expected, array);
	}
}
