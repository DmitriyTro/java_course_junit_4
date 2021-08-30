package dmitriitrofimov.course;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import java.util.*;

public class LinkedOrArrayListTest {

	static List<String> arrayList;
	static List<String> linkedList;

	@BeforeClass
	public static void setUpBeforeClass() {
		System.out.println("Populating ArrayList...");
		arrayList = new ArrayList<>();
		for (int i = 0; i < 10_000_000; i++) {
			arrayList.add("" + i);
		}
		System.out.println("Done.");

		linkedList = new LinkedList(arrayList);
	}

	@Test(timeout = 3)
	@Ignore
	public void testRemoval_AL() {
		LinkedOrArrayList.remove(arrayList, "123");
	}

	@Test(timeout = 2)
	public void testRemoval_LL() {
		LinkedOrArrayList.remove(linkedList, "123");
	}
}