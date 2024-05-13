package java8example;

@FunctionalInterface
interface A{
	void test();
	default void test1() {
		System.out.println("default test1 ");
	}
	static void test2() {
		System.out.println("default test1 ");
	}
}

class I1 implements A {

	@Override
	public void test() {

		
	}
	
	@Override
	public void test1() {
		System.out.println("default test1");
	}
	@Override // CTE because static method cannot be overridden
	static void test2() {
		System.out.println("static test2");
	}
	
}

class I2 implements A{

	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}
	
}

public class DefaultAndStaticExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
