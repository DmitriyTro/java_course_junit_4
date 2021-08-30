package dmitriitrofimov.course;

import java.util.List;

public class LinkedOrArrayList {

	public static void remove(List<String> list, String el) {
		System.out.println(list.getClass().getSimpleName() + " :\t");
		long start = System.nanoTime();
		list.remove(el);
		long stop = System.nanoTime();
		System.out.println("Took " + (stop - start) + " nanos.");
	}
}