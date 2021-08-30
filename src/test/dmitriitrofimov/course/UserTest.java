package dmitriitrofimov.course;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class UserTest {
	User kolya = new User("Kolya", 28);

	@Before
	public void setUp() {
		kolya.setAge(25);
		System.out.println("setUp");
	}

	@Test
	public void test1() {
//		kolya.setAge(25);
		System.out.println(kolya.getAge());
	}

	@Test
	public void test2() {
		System.out.println(kolya.getAge());
	}

	@After
	public void tearDown() {
		kolya.setAge(23);
		System.out.println("tearDown");
	}
}
