package multipleinheritanceinterface;

public class MITest implements A, B{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MITest t = new MITest();
		t.test();

	}
	public void test() {
		A.super.test();
	}
	@Override
	public void calculate() {
		// TODO Auto-generated method stub
		
	}

}
