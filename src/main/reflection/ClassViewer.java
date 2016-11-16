package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassViewer {
	public static void showClassInfo(String classAbsName) {
		try {
			Class<?> clazz = Class.forName(classAbsName);
			System.out.println("class name: " + clazz.getCanonicalName());
			Constructor<?>[] constructors = clazz.getConstructors();
			System.out.println("class constructors:");
			for (Constructor<?> constructor : constructors) {
				System.out.println("\t" + constructor);
			}
			Field[] fields = clazz.getDeclaredFields();
			System.out.println("class declared fields:");
			for (Field field : fields) {
				System.out.println("\t" + field);
			}
			Method[] methods = clazz.getDeclaredMethods();
			System.out.println("class declared methods:");
			for (Method method : methods) {
				System.out.println("\t" + method);
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		ClassViewer.showClassInfo("java.util.ArrayList");
	}
}
