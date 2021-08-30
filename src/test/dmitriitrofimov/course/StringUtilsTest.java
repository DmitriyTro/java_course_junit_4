package dmitriitrofimov.course;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringUtilsTest {
	StringUtils su = new StringUtils();

	// "  **" ---> "**", " **" ---> "**", "***" ---> "***", "**  " ---> "**  "

//	@Test
//	public void testChopOff2StarsAtHead_BothAtLeft() {
//		assertEquals("**", su.chopOff2SpacesAtHead("  **"));
//	}
//
//	@Test
//	public void testChopOff2StarsAtHead_Single() {
//		assertEquals("**", su.chopOff2SpacesAtHead(" **"));
//	}
//
//	@Test
//	public void testChopOff2StarsAtHead_Single_None() {
//		assertEquals("****", su.chopOff2SpacesAtHead("****"));
//	}
//
//	@Test
//	public void testChopOff2StarsAtHead_Single_BothAtRight() {
//		assertEquals("**  ", su.chopOff2SpacesAtHead("**  "));
//	}

	// "1234" ---> false, "1212" ---> true, "12" ---> true, "1" ---> false

	@Test
	public void testAre2CharsAtHeadAndTailEquals_GenAllDiffFalse() {
		assertFalse(su.are2CharsAtHeadAndTailEquals("1234"));
	}

	@Test
	public void testAre2CharsAtHeadAndTailEquals_GenAllSameTrue() {
		assertTrue(su.are2CharsAtHeadAndTailEquals("1212"));
	}

	@Test
	public void testAre2CharsAtHeadAndTailEquals_OnlyTwo() {
		assertTrue(su.are2CharsAtHeadAndTailEquals("12"));
	}

	@Test
	public void testAre2CharsAtHeadAndTailEquals_OnlyOne() {
		assertFalse(su.are2CharsAtHeadAndTailEquals("1"));
	}
}