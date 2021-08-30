package dmitriitrofimov.course;

import org.junit.*;

public class UserTest {
	static User kolya = new User("Kolya", 28);

	@BeforeClass
	public static void setUpBeforeClass() {
		kolya.setAge(20);
		System.out.println("setUpBeforeClass*");
		System.out.println("*********************");
	}

	@AfterClass
	public static void tearDownAfterClass() {
		System.out.println("tearDownAfterClass*");
		System.out.println("*********************");
	}

	@Before
	public void setUp() {
		kolya.setAge(25);
		System.out.println("setUp");
	}

	@After
	public void tearDown() {
		kolya.setAge(23);
		System.out.println("tearDown");
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
}
