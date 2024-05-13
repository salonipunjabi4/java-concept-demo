package reflectionexample;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionTest {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub
		Constructor<Example> pcc = Example.class.getDeclaredConstructor();
		pcc.setAccessible(true);
		Example privateContructorInstance = pcc.newInstance();
		
		Method method = Example.class.getDeclaredMethod("test", null);
		//method name and arguments
		method.setAccessible(true);
		method.invoke(privateContructorInstance);
		
		Example2 e = new Example2();
		Method method1 = Example2.class.getDeclaredMethod("test", String.class);
		method1.setAccessible(true);
		//method1.invoke(e);
		//System.out.println(method1.invoke(e)); if we want to return from method and print it
		System.out.println(method1.invoke(e, "Hello"));

	}

}
