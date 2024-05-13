package methodreference;

public class MethodReferenceDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Display all the records or customer
		
		
		
		CustomerDB.getAllCustomer().stream().forEach(customer -> System.out.println(customer));
		System.out.println("------------------");
		CustomerDB.getAllCustomer().stream().forEach(System.out::println);
		
		System.out.println("------------------");
		
		MethodReferenceDemo1 mf = new MethodReferenceDemo1();
		CustomerDB.getAllCustomer().stream().forEach(mf::display);
		
		System.out.println("------------------");
		
		CustomerDB.getAllCustomer().stream().map(customer -> CustomerMapper.convert(customer)).forEach(System.out::println);
		
		System.out.println("------------------");
		
		CustomerDB.getAllCustomer().stream().map(CustomerMapper :: convert).forEach(System.out::println);
		
		CustomerMapper cm = new CustomerMapper();
		CustomerDB.getAllCustomer().stream().map(cm::convert1).forEach(System.out::println);
	}
	
	public void display(Customer customer) {
		//System.out.println(customer);
	}

}
