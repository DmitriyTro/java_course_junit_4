package dmitriitrofimov.course;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class VerifyDemo {
	public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException,
			IllegalAccessException {

		Class<?> clazz = Class.forName("dmitriitrofimov.course.Pupil");
		Pupil pupil = new Pupil();
		for (Method method : clazz.getMethods()) {
			Verify v = method.getAnnotation(Verify.class);
			if (v != null) {
				Object result = method.invoke(pupil);
				if ((Boolean) result) {
					System.out.println(method.getName() + " passed.");
				} else {
					System.out.println(method.getName() + " failed.");
				}
			}
		}
	}
}