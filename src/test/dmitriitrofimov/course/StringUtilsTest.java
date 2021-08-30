package dmitriitrofimov.course;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringUtilsTest {

	@Test
	public void testChopOff2StarsAtHead() {
		assertEquals("**", StringUtils.chopOff2StarsAtHead("  **"));
		assertEquals("**", StringUtils.chopOff2StarsAtHead(" **"));
		assertEquals("****", StringUtils.chopOff2StarsAtHead("****"));
		assertEquals("**  ", StringUtils.chopOff2StarsAtHead("**  "));
	}
}