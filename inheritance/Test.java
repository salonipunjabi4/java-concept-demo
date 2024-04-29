package com.inheritance;

public class Test {
	
	public static void main(String args[]) {
		ContractEmployee ce = new ContractEmployee();
		ce.setNoOfHours(5);
		ce.setId(100);
		ce.setName("Allen");
		ce.setAddress("NY");
		ce.setMobileNo("5879856584");
		System.out.println(ce.getId()+","+ce.getName()+","+ce.getAddress()+","+ce.getMobileNo()+","+ce.getNoOfHours());
		
		HR hr = new HR();
		hr.setId(102);
		hr.setName("Cole");
		hr.setAddress("PA");
		hr.setMobileNo("4785961528");
		hr.setManageResource("Zack");
		System.out.println(hr.getId()+","+hr.getName()+","+hr.getAddress()+","+hr.getMobileNo()+","+hr.getManageResource());
		
		
		RegularEmployee re = new RegularEmployee();
		re.setId(103);
		re.setName("Zack");
		re.setMontlySalary(4000.0);
		re.setAddress("CA");
		re.setMobileNo("5628957485");
		System.out.println(re.getId()+","+re.getName()+","+re.getAddress()+","+re.getMobileNo()+","+re.getMontlySalary());
		
		
	}

}
