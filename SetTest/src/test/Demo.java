package test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Demo {

	public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class<String> clazz[] = new Class[1];
		clazz[0] = String.class;
		//clazz[0] = (Class<String>) Class.forName("java.lang.String");
		
		try {
			Method method = clazz[0].getClass().getDeclaredMethod("charAt", clazz);
			method.invoke(new String(), 0);
		} catch (NoSuchMethodException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
