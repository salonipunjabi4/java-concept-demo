package marker;

public class DeletableTest {
	
	//other dao methods
	public boolean delete(Object object) {
		if((object instanceof Deletable)) {
			return false;
		}
		//delete implementation details
		return true;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deletable d1 = new Entity();
		Deletable d2 = new Entity1();
		Entity2 d3 = new Entity2();
		DeletableTest sd = new DeletableTest();
		if(sd.delete(d1)) {
			System.out.println("If body");
		}else {
			System.out.println("Else body");
		}

	}

}
