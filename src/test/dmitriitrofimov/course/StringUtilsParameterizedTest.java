package dmitriitrofimov.course;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(value = Parameterized.class)
public class StringUtilsParameterizedTest {
	private Boolean boo;
	private String arg;

	public StringUtilsParameterizedTest(Boolean boo, String arg) {
		this.boo = boo;
		this.arg = arg;
	}

	@Parameters
	public static Collection<Object[]> getTestParameters() {
		return Arrays.asList(new Object[][]{
				{Boolean.FALSE, "1234"},
				{Boolean.TRUE, "1212"},
				{Boolean.TRUE, "12"},
				{Boolean.FALSE, "1"}
		});
	}

	@Test
	public void testAre2CharsAtHeadAndTailEquals() {
		StringUtils su = new StringUtils();
		assertEquals(boo, su.are2CharsAtHeadAndTailEquals(arg));
	}
}