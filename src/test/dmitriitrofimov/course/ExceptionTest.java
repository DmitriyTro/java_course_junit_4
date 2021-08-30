package dmitriitrofimov.course;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ExceptionTest {

	@Test(expected = NullPointerException.class)
	public void testBubbleSort() {
		int[] array = null;
		int[] expected = {-17, 3, 4, 12};
		BubbleSort.bubbleSort(array);
		assertArrayEquals(expected, array);
	}
}