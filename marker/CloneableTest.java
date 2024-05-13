package marker;

class My implements Cloneable{
	
	@Override
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
}

public class CloneableTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		My m1 = new My();
		My m2 = (My) m1.clone(); //clone is method of Object class

		System.out.println(m1.hashCode() + "," + m2.hashCode());
	}

}
