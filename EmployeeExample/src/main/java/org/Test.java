package org;

public class Test {

	public static void main(String[] args) {
		//public Employee()
		Employee e1=new Employee();
		e1.firstName="John";
		e1.LastName="Doe";
		e1.age=32;
		e1.address="India";
		e1.Email="gmail.com";
		e1.basicSalary=100000;
		e1.phoneNo="1234567897";
		//public Employee(String firstName, String lastName, int age, String address, String phoneNo, String email,int basicSalary)
		Employee e2=new Employee("Upasana","Dew",32,"India","9620093666","u@gamil.com",100000);
		int tempSalary=e1.calculateSalary(200000);
		System.out.println(tempSalary);
		System.out.println(e1.greeting());
		System.out.println(e1.checkPhone());
		System.out.println(e1.checkEmail());
		
		int temp2=e2.calculateSalary();
		System.out.println(temp2);
		System.out.println(e2.greeting());
		System.out.println(e2.greeting("Ashuit","Khanna"));
		System.out.println(e2.checkPhone());
		System.out.println(e2.checkEmail());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//public Employee(String firstName, String lastName, int age, String address, String phoneNo, String email) 
		Employee e3=new Employee("Upasana","Dew",32,"India","9620093666","u@gamil.com");
		e3.basicSalary=100000;
		//public Employee(String firstName, String lastName, int age, String address,int basicSalary)
		Employee e4=new Employee("Upasana","Dew",32,"India",100000);
		e4.phoneNo="78642234";
		e4.Email="u@gmail.com";
		
	}

}
